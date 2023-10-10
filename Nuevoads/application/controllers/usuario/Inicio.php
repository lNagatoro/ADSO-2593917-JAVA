<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Inicio extends CI_Controller {
	
	public function __construct(){
		parent::__construct();
		$validacion = $this->session->has_userdata("session-mvc");
		if ($validacion) {
			$session = $this->session->userdata("session-mvc");
			if ($session['tipo']=="USUARIO" && $session['estado']=="ACTIVO") {
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
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('usuarios/inicio', $data);
	}

	public function openInfoUsers(){
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('usuarios/informacion', $data);
	}
	

}