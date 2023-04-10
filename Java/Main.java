// Todo lo que yo quiero que se vea va a estar aquí
// creamos una clase que coincida con el nombre del archivo
class Main {
    public static void main(String[] args) {
        // System.out.println("Hola mundo"); //escribe hola mundo en la consola
        UberX uberx = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Spark");
        uberx.setPassenger(1);
        uberx.getPassenger();
        uberx.printDataCar(); //Metodo de la clase Car
        
        UberVan ubervan = new UberVan("AMQ123", new Account("Andres Herrera", "AND123"));
        ubervan.setPassenger(6);
        ubervan.printDataCar(); //Metodo de la clase Car

    }
}