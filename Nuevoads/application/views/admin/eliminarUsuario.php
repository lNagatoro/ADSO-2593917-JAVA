<?php
  $dataHeader['titulo'] = "Eliminar Usuarios";  
  $this->load->view('layouts/header', $dataHeader);
?>
<?php
  $dataSidebar['session'] = $session;  
  $dataSidebar['optionSelected'] = 'openDeleteUsers';  
  $this->load->view('layouts/sidebar', $dataSidebar);
?>
      
  <div class="content-wrapper">
    <div class="col-12 m-0 p-3">
      <div class="container">
        <h1>Esta es la informacion</h1>
      </div>
    </div>
  </div>

<?php
  $this->load->view('layouts/footer');
?>
     