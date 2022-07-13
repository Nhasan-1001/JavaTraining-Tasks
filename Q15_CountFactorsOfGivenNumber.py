# Program to find count of all factors of given number.

def find_factors(inp):
    lst = []
    for i in range (1,inp+1):
        if i > 0:
            if inp % i == 0 :
                lst.append(i)
    print ("Number of factors of the given number is:",len(lst))

inp = int(input("Enter the number: "))
find_factors(inp)