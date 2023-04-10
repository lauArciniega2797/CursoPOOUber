<?php
require_once("Car.php");
class UberBlack extends Car {
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial) {
        
        parent::__construct($license, $driver); //construccion de la clase padre (superclase)
        
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
}

?>