// Aplicar herencia a esta clase. Hereda de Car
public class UberPool extends Car {
    String brand;
    String model;

    // Constructos que recibe 2 datos
    public UberPool(String license, Account driver, String brand, String model){
        super(license, driver); //super representa a la super clase

        // this hace referencia a los atributos de la clase en la que me encuentro en este archivo
        this.brand = brand;
        this.model = model;
    }
}
