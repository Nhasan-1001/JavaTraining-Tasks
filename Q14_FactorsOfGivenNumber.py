# Program to find all factors of the given number.

def find_factors(inp):
    lst = []
    for i in range (1,inp+1):
        if i > 0:
            if inp % i == 0 :
                lst.append(i)
    print ("Factors of given number is in the list: ",lst)

inp = int(input("Enter the number: "))      
find_factors(inp)