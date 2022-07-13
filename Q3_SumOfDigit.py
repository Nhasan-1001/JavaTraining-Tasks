#Sum of Digits / Digital Root

def digital_root(n):
    # ...
    temp = sum (int(i) for i in str(n))
    if temp > 9:
        return digital_root(temp)
    return temp