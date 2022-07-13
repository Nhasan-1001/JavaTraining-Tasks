# Write a program to Display Armstrong Number between Two Intervals.

def Check_armstrong (inp1,inp2):
    print ("Armstrong numbers in the given range is: ")
    for i in range (inp1,inp2+1):
        pow = len(str(i))
        sum = 0
        temp = i
        while temp > 0 :
            C = temp % 10
            sum += C**pow
            temp = temp // 10
        if i == sum:
            print (i,end=" ")
        
inp1 = int(input("Enter the Starting Limit: "))
inp2 = int(input("Enter the Ending Limit: "))
Check_armstrong(inp1,inp2)