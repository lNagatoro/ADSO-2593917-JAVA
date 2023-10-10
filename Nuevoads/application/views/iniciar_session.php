<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Iniciar Session</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link href="https://cdn.jsdelivr.net/npm/sweetalert2@11.7.20/dist/sweetalert2.min.css" rel="stylesheet">
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
    <div class="card-body text-center">
      <p class="login-box-msg"><b><h5>¡Ingrese sus datos para iniciar la session!</h5></b></p>
      <?php if (isset($errorInData)){ ?>
						<div class="alert alert-danger">
							DATOS INCOMPLETOS
						</div>
					<?php } ?>

					<?php if (isset($datosInvalidos)){ ?>
						<div class="alert alert-danger">
							NO EXISTE UN USUARIO CON ESOS DATOS
						</div>
			<?php } ?>
      <form action="<?= base_url('index.php/Login/validarIngreso'); ?>" method="post">
        <div class="input-group mb-3">
          <input type="email" class="form-control <?= (isset($valueEmail) && $valueEmail!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" placeholder="Correo" name="campo_email" value="<?= (isset($valueEmail))? $valueEmail : '' ?>">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control <?= (isset($valueEmail) && $valuePassword!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" placeholder="Contraseña" name="campo_password" value="<?= (isset($valuePassword))? $valuePassword : '' ?>">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-8">
            <div class="icheck-primary">
              <input type="checkbox" id="remember">
              <label for="remember">
                Recuerdame
              </label>
            </div>
          </div>
          <div class="col-4">
            <button type="submit" class="btn btn-primary btn-block">Ingresar</button>
          </div>
        </div>
      </form>

      <div class="social-auth-links text-center mt-2 mb-3">
        <a href="#" class="btn btn-block btn-primary">
          <i class="fab fa-facebook mr-2"></i> Iniciar Session con Facebook
        </a>
        <a href="#" class="btn btn-block btn-danger">
          <i class="fab fa-google-plus mr-2"></i> Iniciar Session con Google+
        </a>
      </div>

      <p class="mb-1">
        <a href="<?= base_url('index.php/creacion/Inicio/recuperar');?>">¿Has Olvidado Tu Contraseña?</a>
      </p>
      <p class="mb-0">
        <a href="<?= base_url('index.php/creacion/Inicio/registrarse');?>" class="text-center">!Registrar Nuevo Usuario¡</a>
      </p>
    </div>
  </div>
</div>
    <?php if (isset($errorInData)): ?>
			<script>
				Swal.fire({
					title: 'DATOS INVALIDOS',
					text: 'El correo y contraseña son obligatorios.',
					icon: 'error',
				});
			</script>
		<?php endif ?>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11.7.20/dist/sweetalert2.all.min.js"></script>
<script src="<?=base_url()?>assets/plugins/jquery/jquery.min.js"></script>
<script src="<?=base_url()?>assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="<?=base_url()?>assets/dist/js/adminlte.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

</body>
</html>