<?php
include('Car.php');
include('Account.php');
include('UberX.php');
include('UberPool.php');
include('User.php');
include('UberVan.php');

// $user = new User("Laurencia", "Documento Laurencia");
// $user->printData();

// $carro = new Car("LAU2797", new Account("Laura Arciniega", "CEC1L14"));
// $carro->printDataCar();

$uberx = new UberX("licencia", new Account('Account User', 'docUser'), "Marca", "Modelo");
$uberx->printDataCar();

$uberpool = new UberPool("licenciaPool", new Account('Account UserPool', 'docUserPool'), "MarcaPool", "ModeloPool");
$uberpool->printDataCar();

$ubervan = new UberVan("licenciaVan", new Account('Account UserVan', 'docUserVan'));
$ubervan->setPassenger(6);
$ubervan->getPassenger();
$ubervan->printDataCar()
?>