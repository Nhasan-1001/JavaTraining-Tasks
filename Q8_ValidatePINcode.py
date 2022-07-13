#Regex validate PIN code

def validate_pin(pin):
    #return true or false
    if pin.isdigit() == False:
        return False
    elif len(pin) < 0:
        return False
    elif len(pin) == 4 or len(pin) == 6:
        return True
    else:
        return False