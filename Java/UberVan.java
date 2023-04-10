import java.util.ArrayList;
import java.util.Map;

// Aplicar herencia a esta clase. Hereda de Car
public class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    // Constructos que recibe 2 datos
    public UberVan(String license, Account driver){
        super(license, driver); //super representa a la super clase
    }
    // public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
    //     super(license, driver); //super representa a la super clase

    //     // this hace referencia a los atributos de la clase en la que me encuentro en este archivo
    //     this.typeCarAccepted = typeCarAccepted;
    //     this.seatsMaterial = seatsMaterial;
    // }

    public void setPassenger(Integer passenger) {
        if(passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Asigna 6 pasajeros");
        }
    }
}