<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Usuario extends CI_Controller {

	public function __construct(){
		parent::__construct();
		$this->load->model('Personas');
        $this->load->model('Usuarios');

		
	}

	public function index(){
		$this->load-view('registrar_usuario');
	}

	

	public function registrar() {

		$data["cedula"] = $this->input->post("cedula");
		$data["nombres"] = $this->input->post("nombres");
		$data["apellidos"] = $this->input->post("apellidos");
		$data["telefono"] = $this->input->post("telefono");
		$data["direccion"] = $this->input->post("direccion");
		$data["email"] = $this->input->post("email");
		

      
        $this->Personas->insertar_persona($data);
		
       
        $vdata = [
			'cedula' => $this->input->post("cedula"),
			'email' => $this->input->post("email"),
			'password' => md5($this->input->post("password")),
			'tipo' => 'USUARIO',
			'estado' => 'ACTIVO'
		];
        

        
        $this->Usuarios->insertar_usuario($vdata);

      
		redirect('iniciar_session','refresh');
    }
	
}