<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Recuperar Contraseña</title>
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
<body class="hola hold-transition login-page">
<div class="login-box">
  <div class="card card-outline card-primary">
    <div class="card-header text-center">
      <p><h4><b>Recuperacion De Contraseña</b></h4></p>
    </div>
    <div class="card-body">
      <p class="login-box-msg"><b>!Estás a sólo un paso de tu nueva contraseña, recupera tu contraseña ahora¡</b></p>
      <form action="login.html" method="post">
        <div class="input-group mb-3">
          <input type="password" class="form-control" placeholder="Contraseña">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control" placeholder="Confirmar Contraseña">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-12">
            <button type="submit" class="btn btn-primary btn-block">Recuperar Contraseña</button>
          </div>
        </div>
      </form>

      <p class="mt-3 mb-1">
        <a href="<?= base_url('index.php');?>">Iniciar Session</a>
      </p>
    </div>
  </div>
</div>
<script src="<?=base_url()?>assets/plugins/jquery/jquery.min.js"></script>
<script src="<?=base_url()?>assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="<?=base_url()?>assets/dist/js/adminlte.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

</body>
</html>
