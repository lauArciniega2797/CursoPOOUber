# IMPORTAR LA CLASE
from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("LAU2797", Account("Laura Arciniega", "LCAR2797"))    
    print(vars(car))
    print(vars(car.driver))