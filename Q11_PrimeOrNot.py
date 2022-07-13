# Program to check given number is prime or not.

def check_prime (inp):
    for i in range (2,inp):
        if inp % i == 0 :
            print ("Not Prime")
            break
    else:
        print ("Prime Number")
inp = int(input("Enter the Input: "))
check_prime(inp)