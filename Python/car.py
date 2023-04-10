from account import Account #importamos la clase account

class Car:
    id          = int
    license     = str
    driver      = Account("", "") #instanciamos la calse
    passenger   = int
    
    def __init__(self, license, driver):
        self.license = license
        self.driver = driver