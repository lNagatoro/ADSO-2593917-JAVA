<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Personas extends CI_Model {
        
    
    public function __construct(){
        $this->load->database();
    }


    public function insertar_persona($data) {
        $this->db->insert('personas', $data);
       
    }

    
    public function actualizarPersona($cedula, $nombres, $apellidos, $telefono, $direccion, $correo) {
        $data = array(
            'nombres' => $nombres,
            'apellidos' => $apellidos,
            'telefono' => $telefono,
            'direccion' => $direccion,
            'email' => $correo
            
        );
    
        $this->db->where('cedula', $cedula);
        $this->db->update('personas', $data);
    }
    
    public function eliminarUsuario($cedula) {
        $this->db->where('cedula', $cedula);
        $this->db->delete('personas'); 
        if ($this->db->affected_rows() > 0) {
            return true;
        } else {
            $error = $this->db->error();
            echo "Error: " . $error['message'];
            return false;
        }
    }

    

}
?>