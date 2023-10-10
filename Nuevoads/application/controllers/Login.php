<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Login extends CI_Controller {

	public function index(){
		$this->load->view('iniciar_session');
	}

	public function validarIngreso(){
		$email = $this->input->post('campo_email');
		$password = $this->input->post('campo_password');

		if ($email!="" && $password!="") {
			$this->load->model('PersonasModel');
			$this->load->model('UsuariosModel');
			$validacion = $this->UsuariosModel->validarIngreso($email, $password);

			if ($validacion) {
				$datosPersona = $this->PersonasModel->getPersonaByEmail($email);
				$datosUsuario = $this->UsuariosModel->getUsuarioByEmail($email);

				$dataSession = [
								  "cedula" => $datosPersona->cedula,
								  "nombres" => $datosPersona->nombres,
								  "apellidos" => $datosPersona->apellidos,
								  "telefono" => $datosPersona->telefono,
								  "direccion" => $datosPersona->direccion,
								  "email" => $datosPersona->email,
								  "tipo" => $datosUsuario->tipo,
								  "estado" => $datosUsuario->estado,
							   ];
				$this->session->set_userdata("session-mvc", $dataSession);

				if ( $datosUsuario->tipo == "ADMIN" ) {
					redirect('admin/Inicio','refresh');
				}else if( $datosUsuario->tipo == "USUARIO" ){
					redirect('usuario/Inicio','refresh');
				}else{
					redirect('Login','refresh');
				}
			}else{
				$data['datosInvalidos'] = true;
				$this->load->view('iniciar_session', $data);
			}		
		}else{
			$data['errorInData'] = true;
			$data['valueEmail'] = $email;
			$data['valuePassword'] = $password;
			$this->load->view('iniciar_session', $data);
		}
	}
	
	public function cerrarSession(){
		$this->session->sess_destroy();
		redirect('Login','refresh');
	}

	
}