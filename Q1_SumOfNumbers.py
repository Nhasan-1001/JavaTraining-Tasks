#Sum of Numbers

def get_sum(a,b):
    #good luck!
    temp1 = min(a,b)
    temp2 = max(a,b)
    sum=0
    for i in range(temp1,temp2+1):
        sum = sum+i 
    return sum