<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Registrarse</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <link rel="stylesheet" href="<?=base_url()?>assets/plugins/fontawesome-free/css/all.min.css">
  <link rel="stylesheet" href="<?=base_url()?>assets/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <link rel="stylesheet" href="<?=base_url()?>assets/dist/css/adminlte.min.css">
</head>
<style>
   .hola{
    background-image: url(<?=base_url('assets/dist/img/80891.jpg')?>);
    background-repeat: no-repeat;
    background-size: cover;
   }
</style>
<body class="hola hold-transition register-page">
<div class="register-box text-center">
  <div class="card card-outline card-primary">
      <?php if (isset($dateIncompletos)): ?>
        <div class="mt-4 text-center alert alert-danger">
          Faltan datos por llenar
        </div>
      <?php endif ?>
      <?php if (isset($datosRepetidos)): ?>
        <div class="mt-4 text-center alert alert-danger">
          Se presentaron datos repetidos:<br>
          <b> - CEDULA </b><br>
          <b> - CORREO </b>
        </div>
      <?php endif ?>
    
      <?php if (isset($date_validos)): ?>
        <script>
          Swal.fire({
            title: 'DATOS VALIDOS',
            text: 'EL usuario ha sido creado con éxito',
            icon: 'success',
          });
        </script>
      <?php endif ?>
    <div class="card-body">
      <p class="login-box-msg"><b><h4>!Registrar un nuevo usuario¡</h4></b></p>
      <form action="<?= base_url('index.php/creacion/Usuario/registrar');?>" method="post">

        <div class="input-group mb-3">
          <input type="text" name="cedula" class="form-control" placeholder="Cedula">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="text" name="nombres" class="form-control" placeholder="Nombre">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="text" name="apellidos" class="form-control" placeholder="Apellido">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="number" name="telefono" class="form-control" placeholder="Telefono">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="text" name="direccion" class="form-control" placeholder="Direccion">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="email" name="email" class="form-control" placeholder="Email">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" name="password" class="form-control" placeholder="Contraseña">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row text-center">
          <div class="col-4">
            <button type="submit" class="btn btn-primary">Registrarse</button>
          </div>
        </div>
      </form>

      <div class="social-auth-links text-center">
        <a href="#" class="btn btn-block btn-primary">
          <i class="fab fa-facebook mr-2"></i>
          Iniciar Session con Facebook
        </a>
        <a href="#" class="btn btn-block btn-danger">
          <i class="fab fa-google-plus mr-2"></i>
          Iniciar Session con Google+
        </a>
      </div>

      <a href="<?= base_url('index.php');?>" class="text-center">!Ya estoy Registrado¡</a>
    </div>
  </div>
</div>
<script src="<?=base_url()?>assets/plugins/jquery/jquery.min.js"></script>
<script src="<?=base_url()?>assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="<?=base_url()?>assets/dist/js/adminlte.min.js"></script>
<script src="<?=base_url()?>assets/dist/js/my_script.js"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

</body>
</html>
