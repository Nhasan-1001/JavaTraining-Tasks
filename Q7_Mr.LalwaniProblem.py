# Mr. Lalwani having Some Currency. The currency having number as Palidrome gets 3 times more than the currency. 
#So help out Mr. Lalwani to check which currency going to give him 3 times return.

inp1 = str(input("Enter the SERIAL NUMBER: "))
inp2 = int(input("Enter the amout of the CURRENCY: "))
palindrome = inp1[::-1]
if inp1 == palindrome:
    print("Hurrah! You are eligible to get INR",(3*inp2))
else:
    print("Sorry! You are not eligible :(")