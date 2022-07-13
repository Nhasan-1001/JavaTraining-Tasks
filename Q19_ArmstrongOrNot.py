# Write program to check given number is Armstrong or not.

def Check_armstrong (inp):
    pow = len(str(inp))
    temp = inp
    sum = 0
    while temp != 0 :
        C = temp % 10
        sum += C**pow
        temp = temp // 10
    if sum == inp:
        print ("Yes! It's an Armstrong Number")
    else:
        print ("Nope! The Number is not an Armstrong Number")
inp = int(input("Enter the Number: "))
Check_armstrong(inp)