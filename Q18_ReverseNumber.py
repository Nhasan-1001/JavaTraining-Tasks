# Write a program reverse the given number.

def Reverse_number (inp):
    inp = str(inp)
    reverse = inp[::-1]
    print ("Reverse number is: ",reverse)

Reverse_number(inp = int(input("Enter the number: ")))
