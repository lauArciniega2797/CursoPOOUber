<?php

class Car {
    public $id;
    public $license;
    public $driver;
    protected $passenger;

    public function __construct($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar() {
        var_dump("<br>| Licencia: " . $this->license ." | Driver: " . $this->driver->name . " | Passengers: " . $this->passenger);
    }

    // GETTER Y SETTERS
    public function getPassenger() {
        return $this->passenger;
    }

    public function setPassenger($passenger){
        if($passenger == 4){
            $this->passenger = 4;
        } else {
            var_dump('Asigna 4 pasajeros');
        }
    }
}