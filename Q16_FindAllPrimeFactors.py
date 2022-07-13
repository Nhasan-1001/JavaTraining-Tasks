# Program to find all prime factors of given number

def find_factors(inp):
    cons = 2
    print ("Prime Factors of the given number is: ")
    while inp > 1 :
        if inp % cons == 0 :
            print(cons, end=" ")
            inp = inp / cons
        else:
            cons = cons + 1

inp = int(input("Enter the number: "))
find_factors(inp)

