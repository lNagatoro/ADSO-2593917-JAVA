<?php
  $dataHeader['titulo'] = "Informacion";  
  $this->load->view('layouts/header', $dataHeader);
?>
<?php
  $dataSidebar['session'] = $session;  
  $dataSidebar['optionSelected'] = 'openInfoUsers';  
  $this->load->view('layouts/sidebar1', $dataSidebar);
?>
  <div class="content-wrapper">
    <div class="col-12 m-0 p-3">
      <h1 class="text-primary text-center">INFORMACION</h1>
    </div>
  </div>

  <div class="container">

  </div>

<?php
  $this->load->view('layouts/footer');
?>