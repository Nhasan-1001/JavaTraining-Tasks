# Program to print count of all prime numbers upto given number.

def count_prime (inp):
    lst = []
    for i in range (1,inp+1):
        if i == 0 or i == 1:
            continue
        else:
            for j in range (2, int(i/2)+1):
                if i % j == 0:
                    break
            else:
                lst.append(i)
    print ("The number of Prime number present is : ",len(lst))

inp = int(input("Enter the ending range value: "))
count_prime(inp)