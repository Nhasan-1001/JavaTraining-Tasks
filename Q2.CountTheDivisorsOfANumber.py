#Count the divisors of a number

def divisors(n):
    count = 1
    i = 1
    while i <= n/2:
        if n % i == 0:
            count += 1
        i += 1
    return count
    pass