# Program to print all prime numbers between given range.

def prime(inp1, inp2):
    prime_list = []
    for i in range(inp1, inp2+1):
        if i == 0 or i == 1:
            continue
        else:
            for j in range(2, int(i/2)+1):
                if i % j == 0:
                    break
            else:
                prime_list.append(i)
    return prime_list
    

inp1 = int(input("Starting limit value: "))
inp2 = int (input("Ending limit value: "))
#prime(inp1,inp2)
lst = prime(inp1,inp2)
if len(lst) == 0:
    print("There are no prime numbers in this range")
else:
    print("All the prime numbers in the given range is: ", lst)
    print ("The number of Prime numbers is: ",len(lst))