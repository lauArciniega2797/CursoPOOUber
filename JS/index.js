// en el curso declaran clases con funciones pero actualmente (2023) ya se pueden declara con el objecto class
/* 
    ejemplo
    class Rectangulo {
        constructor(alto, ancho) {
            this.alto = alto;
            this.ancho = ancho;
        }
        //Getters
        get area () {
            return this.calcularArea()
        }
        get perimetro() {
            return this.calcularPerimetro()
        }
        ///Métodos
        calcularArea() {
            return this.alto * this.ancho
        }
        calcularPerimetro() {
            return (this.alto + this.alto) + (this.ancho + this.ancho)
        }
    }
    let figure = new Rectangulo(20, 30)
    console.log(figure.alto)
    console.log(figure.ancho)
    console.log(figure.area)
    console.log(figure.perimetro)
*/

// En este código notarás el uso de la palabra reservada this. Normalmente cuando usamos la sintaxis punto siempre lo haremos a partir de un objeto instanciado, en este caso con this, se hace una simulación al objeto en cuestión, a pesar de que en ese momento visualmente sigue siendo una clase.




//llamar al objeto car
let car = new Car("AW9704", new Account("Andres Herrera", "LAU2797"))
car.passenger = 4
car.printDataCar()

let uberx = new UberX("licencia", new Account("user name", "user doc"), "marca", "modelo")
uberx.passenger = 4
uberx.printDataCar()

let user = new User("Laurencia", "Documento Laurencia")
user.printData()