class Car {
    // Atributos de la clase (variables globales)
    private Integer id;
    public String  license;
    public Account driver; //es porque hereda de la clase account
    protected Integer passenger; //Este atributo solo es visible en esta clase

    //definir constructor
    public Car(String license, Account driver) { // los parametros pueden tener otro nombre, pero por buna practica se pone el mismo que el atributo. Los parametros son variables locales
        this.license = license;
        this.driver = driver;
        //cuidar la consistencia de los tipos de datos
    }

    //definir metodos
    //metodo para traer datos de la clase y mostrarlos
    void printDataCar() {
        if(passenger != null){
            System.out.println("| License: " + license + " | Conductor: " + driver.name + " | Pasajeros: " + passenger + " |");
        }
    }

    // GETTERS Y SETTERS DE PASSENGERS
    public Integer getPassenger(){ //esto es una función que solo devuelve datos
        return passenger;
    }

    public void setPassenger(Integer passenger){ //esto es una función que modifica datos
        if(passenger == 4){
            this.passenger = passenger;
        } else {
            System.out.println("Asigna 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}
