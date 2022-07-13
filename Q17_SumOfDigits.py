# Write a program to print sum of digits. (eg. 512 = 8)

def Sum_of_digit (inp):
    sum = 0
    for i in str (inp):
        sum += int(i)
    print("Sum of the digit is: ",sum)
Sum_of_digit(inp = int(input("Enter the Input Number: ")))