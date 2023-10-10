<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Inicio extends CI_Controller {



    public function registrarse(){
		$this->load->view('registrar_usuario');
	}

	public function recuperar(){
		$this->load->view('recuperar_password');
	}
	
}