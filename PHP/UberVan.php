<?php
require_once("Car.php");
class UberVan extends Car {
    public $typeCarAccepted;
    public $seatsMaterial;

    /*public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial) {
        
        parent::__construct($license, $driver); //construccion de la clase padre (superclase)
        
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }*/
    public function __construct($license, $driver) {
        
        parent::__construct($license, $driver); //construccion de la clase padre (superclase)
        
    }

    public function setPassenger($passenger){
        if($passenger == 6){
            $this->passenger = $passenger;
        } else {
            var_dump("Asigne 6 pasajeros");
        }
    }
}

?>