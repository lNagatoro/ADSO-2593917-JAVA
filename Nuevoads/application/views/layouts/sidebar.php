      <aside class="main-sidebar sidebar-dark-success elevation-4">
        <a href="<?= base_url('index.php/admin/inicio');?>" class="brand-link">
          <img src="<?= base_url('assets/dist/img/AdminLTELogo.png') ?>" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
          <span class="brand-text font-weight-light">Dashboar Nuevo</span>
        </a>
        <div class="sidebar">
          <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
              <img src="<?= base_url('assets/dist/img/avatar5.png') ?>" class="img-circle elevation-2" alt="User">
            </div>
            <div class="info">
              <a href="#" class="d-block"><?= explode(" ", $session['nombres'])[0]." ".explode(" ", $session['apellidos'])[0] ?></a>
            </div>
          </div>
          <nav class="mt-2">
            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
              <li class="nav-header">MENU ADMIN</li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/admin/Inicio/openCreateUser') ?>" class="nav-link <?= ($optionSelected=='openCreateUser')? 'active':''?>">
                <i class="fa-solid fa-user"></i>
                  <p>
                    Crear Usuario
                  </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/admin/Inicio/openEditUsers') ?>" class="nav-link <?= ($optionSelected=='openEditUsers')? 'active':''?>">
                  <i class="fa-solid fa-upload"></i>
                  <p>
                    Publicaciones
                  </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/admin/Inicio/openDeleteUsers') ?>" class="nav-link <?= ($optionSelected=='openDeleteUsers')? 'active':''?>">
                  <i class="fa-solid fa-scroll"></i>
                  <p>
                    Informacion
                  </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/admin/Inicio/openCrudAjax') ?>" class="nav-link <?= ($optionSelected=='openListUsers')? 'active':''?>">
                  <i class="fa-solid fa-rectangle-list"></i>
                  <p>
                    Ver Usuarios
                  </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/Login/cerrarSession') ?>" class="nav-link">
                <i class="fa-solid fa-arrow-right-from-bracket"></i>
                  <p>
                    Cerrar Sesion
                  </p>
                </a>
              </li>
            </ul>
          </nav>
        </div>
      </aside>
