<?php
  $dataHeader['titulo'] = "Editar Usuarios";  
  $this->load->view('layouts/header', $dataHeader);
?>
<?php
  $dataSidebar['session'] = $session;  
  $dataSidebar['optionSelected'] = 'openEditUsers';  
  $this->load->view('layouts/sidebar', $dataSidebar);
?>

  <div class="content-wrapper">
    <div class="col-12 m-0 p-3">

   
    </div>
  </div>


<?php
  $this->load->view('layouts/footer');
?>