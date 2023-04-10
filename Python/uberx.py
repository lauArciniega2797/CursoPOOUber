from car import Car #Importamos la clase Car, que es de donde Hereda esta clase

class UberX(Car):
    brand = str
    model = str
    
    def __init__(self, license, driver, brand, model):
        super.__init__(license, driver)
        
        self.brand = brand
        self.model = model