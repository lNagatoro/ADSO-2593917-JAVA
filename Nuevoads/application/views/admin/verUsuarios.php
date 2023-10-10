<?php 
  $dataHeader['titulo'] = "Ver Usuarios";
  $this->load->view('layouts/header', $dataHeader); 
?>
<?php 
  $dataSidebar['session'] = $session;
  $dataSidebar['optionSelected'] = 'openListUsers';
  $this->load->view('layouts/sidebar', $dataSidebar); 
?>

<div class="content-wrapper">
  <div class="col-12 m-0 p-2 bg-white">
    

    <div class="table">

    </div>
      
      <table id="tablaUsuarios" class="table table-bordered">
        <thead>
          <tr>
            <th>CEDULA</th>
            <th>NOMBRES</th>
            <th>APELLIDOS</th>
            <th>TELEFONO</th>
            <th>DIRECCION</th>
            <th>CORREO</th>
            <th>EDITAR</th>
            <th>ELIMINAR</th>
          </tr>
          
        </thead>
        <tbody id="tbodyPersonas">
        
        </tbody>
      </table> 
    </div>
  </div>

     
  
  <div class="modal fade" id="editarUsuarioModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel"><p>Editar Usuario</p></h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          
          <form id="formEditarUsuario" action="<?=base_url('index.php/admin/Usuario/actualizarUsuario')?>" method="POST">
            <div class="row mb-3">
              <div class="col">
                <label for="editarCedula" class="form-label">
                <i class="fas fa-id-card"></i>Cedula</label>
                <input type="number" class="form-control" id="editarCedula" name="cedula">
              </div>
  
              <div class="col">
                <label for="editarNombre" class="form-label">
                <i class="fas fa-user"></i>Nombres</label>
                <input type="text" class="form-control" id="editarNombre" name="nombres" required>
              </div>
            </div>
            <div class="row mb-3">
              <div class="col">
                <label for="editarApellido" class="form-label">
                <i class="fas fa-user"></i>Apellidos</label>
                <input type="text" class="form-control" id="editarApellido" name="apellidos" required>
              </div>
  
              <div class="col">
                <label for="editarTelefono" class="form-label">
                <i class="fas fa-phone"></i>Telefono</label>
                <input type="number" class="form-control" id="editarTelefono" name="telefono" required>
              </div>
            </div>
            <div class="row mb-3">
              <div class="col">
                <label for="editarDireccion" class="form-label">
                <i class="fas fa-map-marker-alt"></i>Direccion</label>
                <input type="text" class="form-control" id="editarDireccion" name="direccion" required>
              </div>
  
              <div class="col">
                <label for="editarEmail" class="form-label">
                <i class="fas fa-envelope"></i>Correo</label>
                <input type="email" class="form-control" id="editarEmail" name="email" required>
              </div>
            </div>
            <br>
            <br>
            <button type="sutmid" class="btn btn-primary" onclick="guardarEdicionUsuario()">Guardar Cambios</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div class="modal fade" id="elimarUsuarioModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel"><p>Eliminar Usuario</p></h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          
          <form id="formEliminarUsuario" action="<?=base_url('index.php/admin/Usuario/eliminarUsuarios')?>" method="POST">
            <div class="row mb-3">
              <div class="col">
                <label for="eliminarCedulas" class="form-label">
                <i class="fas fa-id-card"></i>Cedula</label>
                <input type="number" class="form-control" id="eliminarCedulas" name="cedula">
              </div>
  
              <div class="col">
                <label for="eliminarNombres" class="form-label">
                <i class="fas fa-user"></i>Nombres</label>
                <input type="text" class="form-control" id="eliminarNombres" name="nombres" required>
              </div>
            </div>
            <div class="row mb-3">
              <div class="col">
                <label for="eliminarApellidos" class="form-label">
                <i class="fas fa-user"></i>Apellidos</label>
                <input type="text" class="form-control" id="eliminarApellidos" name="apellidos" required>
              </div>
  
              <div class="col">
                <label for="eliminarTelefonos" class="form-label">
                <i class="fas fa-phone"></i>Telefono</label>
                <input type="number" class="form-control" id="eliminarTelefonos" name="telefono" required>
              </div>
            </div>
            <div class="row mb-3">
              <div class="col">
                <label for="eliminarDireccions" class="form-label">
                <i class="fas fa-map-marker-alt"></i>Direccion</label>
                <input type="text" class="form-control" id="eliminarDireccions" name="direccion" required>
              </div>
  
              <div class="col">
                <label for="eliminarEmails" class="form-label">
                <i class="fas fa-envelope"></i>Correo</label>
                <input type="email" class="form-control" id="eliminarEmails" name="email" required>
              </div>
            </div>
            <br>
            <br>
            <button type="sutmid" class="btn btn-primary" onclick="confirmarEliminacion()">Eliminar</button>
          </form>
        </div>
      </div>
    </div>
  </div>


  <div class="modal fade" id="modalCrearUsuario">
    <div class="modal-dialog">
      <form id="formularioCrarUsuario"  action="<?= base_url('index.php/admin/Usuario/createUser'); ?>" method="POST" accept-charset="utf-8">
        <div class="modal-content">
          <div class="modal-header">
            <h4 class="modal-title"><b>CREAR USUARIO</b></h4>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
          <div class="row mb-3">
              <div class="col">
                <label for="campo_cedula" class="form-label">
                  <i class="fas fa-id-card"></i> Cédula
                </label>
                <input type="number" class="form-control" id="campo_cedula" name="campo_cedula" value="">
              </div>
              <div class="col">
                <label for="campo_nombres" class="form-label">
                  <i class="fas fa-user"></i> Nombres
                </label>
                <input type="text" class="form-control" id="campo_nombres" name="campo_nombres" value="">
              </div>
            </div>
  
            <div class="row mb-3">
              <div class="col">
                <label for="campo_apellidos" class="form-label">
                  <i class="fas fa-user"></i> Apellidos
                </label>
                <input type="text" class="form-control" id="campo_apellidos" name="campo_apellidos" value="">
              </div>
              <div class="col">
                <label for="campo_telefono" class="form-label">
                  <i class="fas fa-phone"></i> Teléfono
                </label>
                <input type="number" class="form-control" id="campo_telefono" name="campo_telefono" value="">
              </div>
            </div>
  
            <div class="row mb-3">
              <div class="col">
                <label for="campo_direccion" class="form-label">
                  <i class="fas fa-map-marker-alt"></i> Dirección
                </label>
                <input type="text" class="form-control" id="campo_direccion" name="campo_direccion" value="">
              </div>
            </div>
  
            <div class="row mb-3">
              <div class="col">
                <label for="campo_email" class="form-label">
                  <i class="fas fa-envelope"></i> Email
                </label>
                <input type="email" class="form-control" id="campo_email" name="campo_email" value="">
              </div>
              <div class="col">
                <label for="campo_password" class="form-label">
                  <i class="fas fa-lock"></i> Password
                </label>
                <input type="password" class="form-control" id="campo_password" name="campo_password" value="">
              </div>
            </div>
  
            <div class="row mb-3">
              <div class="col">
                <label for="campo_tipo" class="form-label">
                  <i class="fas fa-user"></i> Tipo
                </label>
                <select class="form-control" id="campo_tipo" name="campo_tipo" value="">
                  <option value="ADMIN">ADMINISTRADOR</option>
                  <option value="USUARIO">USUARIOS</option>
                </select>
              </div>
            </div>
          </div>
          <div class="modal-footer justify-content-between">
            <button type="button" class="btn btn-default" data-dismiss="modal">CERRAR</button>
            <button type="button" onclick="registrarUsuario()"class="btn btn-primary" >REGISTRARSE</button>
          </div>
        </div>
      </form>
    </div>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
  <script src="<?=base_url()?>assets/dist/js/my_script2.js"></script>

<?php 
  $this->load->view('layouts/footer'); 
?>