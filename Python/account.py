# creación de clase para la notación es lowercamelcase y para las clases upper
class Account:
    id          = int
    name        = str
    document    = str
    email       = str
    password    = str
    
    # DEFINIMOS EL CONSTRUCTOR
    def __init__(self, name, document):
        self.name       = name
        self.document   = document