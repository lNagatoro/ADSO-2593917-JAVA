<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Usuarios extends CI_Model {
    

   
    public function __construct(){
        $this->load->database();
    }

    public function insertar_usuario($data) {
        $this->db->insert('usuarios', $data);
    }
    
    public function actualizarUsuario($data) {
       
        $this->db->where('cedula');
        $this->db->update('usuarios', $data);
    }
    
    
    
   
    


}
?>