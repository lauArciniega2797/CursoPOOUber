// Aplicar herencia a esta clase. Hereda de Car
public class UberX extends Car {
    String brand;
    String model;

    // Constructos que recibe 2 datos
    public UberX(String license, Account driver, String brand, String model){
        super(license, driver); //super representa a la super clase

        // this hace referencia a los atributos de la clase en la que me encuentro en este archivo
        this.brand = brand;
        this.model = model;
    }

    public void printDataCar() {
        System.out.println("| License: " + this.license + " | Conductor: " + this.driver.name + " | Pasajeros: " + this.passenger + " | modelo: " + this.model + " | marca: " + this.brand);
    }
}