<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Usuario extends CI_Controller {
	

	public function __construct(){
		parent::__construct();
		$this->load->model('Personas');
		$this->load->model('Usuarios');
		$validacion = $this->session->has_userdata("session-mvc");
		if ($validacion) {
			$session = $this->session->userdata("session-mvc");
			if ($session['tipo']=="ADMIN" && $session['estado']=="ACTIVO") {
				return false;
			}else{
				redirect('Login/cerrarSession','refresh');
				die();
			}
		}else{
			redirect('Login/cerrarSession','refresh');
			die();
		}
	}

	public function index(){
		
	}

	public function createUser(){
		$cedula = $this->input->post('new_cedula');
		$nombres = $this->input->post('new_nombres');
		$apellidos = $this->input->post('new_apellidos');
		$telefono = $this->input->post('new_telefono');
		$direccion = $this->input->post('new_direccion');
		$correo = $this->input->post('new_correo');
		$password = $this->input->post('new_password');
		$tipo = $this->input->post('new_tipo');

		if ($cedula!="" && $nombres!="" && $apellidos!="" && $telefono!="" && $direccion!="" && $correo!="" && $password!="" && $tipo!="") {
			
			$this->load->model('PersonasModel');
			$this->load->model('UsuariosModel');
			
			$cedulaValida = $this->PersonasModel->validarCedula($cedula);
			$emailValido = $this->PersonasModel->validarEmail($correo);

			if ($cedulaValida && $emailValido) {
				$this->PersonasModel->insertar($cedula, $nombres, $apellidos, $telefono, $direccion, $correo);
				$this->UsuariosModel->insertar($cedula, $correo, $password, $tipo);
				
				$data['session'] = $this->session->userdata("session-mvc");
				$data['date_validos'] = true;
				$this->load->view('admin/crearUsuario', $data);
			}else{
				$data['session'] = $this->session->userdata("session-mvc");
				$data['datosRepetidos'] = true;
				$data['cedulaRepetida'] = $cedulaValida ;
				$data['emailRepetido'] = $emailValido ;
				$this->load->view('admin/crearUsuario', $data);
			}
		}else{
			$data['session'] = $this->session->userdata("session-mvc");
			$data['dateIncompletos'] = true;
			$this->load->view('admin/crearUsuario', $data);
		}
	}
	
	
	public function getListaUsuarios(){
		$this->load->model('PersonasModel');
		$datos = $this->PersonasModel->getListaPersonas();
		echo json_encode(  $datos );
	}

	public function insertarUsuario(){

		$cedula = $this->input->post('campo_cedula');
		$nombres = $this->input->post('campo_nombre');
		$apellidos = $this->input->post('campo_apellido');
		$telefono = $this->input->post('campo_telefono');
		$direccion = $this->input->post('campo_direccion');
		$correo = $this->input->post('campo_email');
		$password = $this->input->post('campo_cedula');
		$tipo = $this->input->post('campo_tipo');

		if ($cedula!="" && $nombres!="" && $apellidos!="" && $telefono!="" && $direccion!="" && $correo!="" && $password!="" && $tipo!="") {
			
			$this->load->model('PersonasModel');
			$this->load->model('UsuariosModel');
			
			$cedulaValida = $this->PersonasModel->validarCedula($cedula);
			$emailValido = $this->PersonasModel->validarEmail($correo);

			if ($cedulaValida && $emailValido) {
				$this->PersonasModel->insertar($cedula, $nombres, $apellidos, $telefono, $direccion, $correo);
				$this->UsuariosModel->insertar($cedula, $correo, $password, $tipo);
				
				$data = [
							"status" => true,
							"message" => "OK##INSERT"
						];
				echo json_encode ($data);
			}else{
				$data = [
					"status" => true,
					"message" => "ERROR##DUPLICADO"
				];
				echo json_encode ($data);
			}
		}else{
			$data = [
				"status" => true,
				"message" => "ERRORDATOS##VACIOS"
			];
			echo json_encode ($data);
		}
	}

	

	
	
	public function actualizarUsuario() {	
		if (!empty($_POST['cedula']) && !empty($_POST['nombres']) && !empty($_POST['apellidos']) && !empty($_POST['telefono']) && !empty($_POST['direccion']) && !empty($_POST['email'])) {
			$documento = $_POST['cedula'];
			$nombres = $_POST['nombres'];
			$apellidos = $_POST['apellidos'];
			$telefono = $_POST['telefono'];
			$direccion = $_POST['direccion'];
			$email = $_POST['email'];

			$this->load->database();
			$consulta = "UPDATE personas SET nombres=?, apellidos=?, telefono=?, direccion=?, email=? WHERE cedula=?";
			$this->db->query($consulta, array($nombres, $apellidos, $telefono, $direccion, $email, $documento));
	
			if ($this->db->affected_rows() > 0) {
				$respuesta['respuesta'] = [
					'status' => true,
					'message' => "OK##Cliente##Modificado",

				];
				echo json_encode($respuesta);

			} 
		} else {
			$respuesta['respuesta'] = [
				'status' => false,
				'message' => "ERROR##DATOS##POST",
			];
			echo json_encode($respuesta);
		}
    }

	

	public function eliminarUsuarios() {
		$this->load->model('Personas');
	
		if (!empty($_POST['cedula']) ) {

			$cedula = $_POST['cedula'];
			
	
			try {
				$this->load->database();

				$consulta = "DELETE FROM personas  WHERE cedula=?";
				
				$this->db->query($consulta, array($cedula));

				
				$proceso = $consulta->execute();
	
				if( $proceso ){
					$respuesta = [
									'status' => true,
									'mesagge' => "OK##CLIENT##DELETE"
								  ];
					echo json_encode($respuesta);
				}else{
					$respuesta = [
									'status' => false,
									'mesagge' => "ERROR##CLIENT##DELETE"
								  ];
					echo json_encode($respuesta);
				}
			} catch (Exception $e) {
				$respuesta = [
								'status' => false,
								'mesagge' => "ERROR##SQL",
								'exception' => $e
							  ];
				echo json_encode($respuesta);
			}
		}else{
			$respuesta = [
							'status' => false,
							'mesagge' => "ERROR##DATOS##POST"
						  ];
			echo json_encode($respuesta);
		}
	}
	
	

	

	
}