<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Inicio extends CI_Controller {
	
	public function __construct(){
		parent::__construct();
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
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/inicio', $data);
	}

	public function openCreateUser(){
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/crearUsuario', $data);
	}

	public function openEditUsers(){
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/editarUsuario', $data);
	}

	public function openDeleteUsers(){
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/eliminarUsuario', $data);
	}

	public function openCrudAjax(){
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/verUsuarios', $data);
	}

	
	
	
	
}