<?php
require_once("Car.php");
class UberPool extends Car {
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model) {
        
        parent::__construct($license, $driver); //construccion de la clase padre (superclase)
        
        $this->brand = $brand;
        $this->model = $model;
    }
    public function printDataCar() {
        var_dump("<br>| Licencia: " . $this->license ." | Driver: " . $this->driver->name . " | Passengers: " . $this->passenger . " | modelo: " . $this->model . " | marca: " . $this->brand);
    }
}

?>