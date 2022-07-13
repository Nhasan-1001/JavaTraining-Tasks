#Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. 
#Return the resulting string. Note: input will never be an empty string

def digits(inp):
    empty_string = only_alpha = ""
    lst = []
    if inp == empty_string:
        print("Input will never be an empty string")
    for i in inp:
        if ord(i) >= 65 and ord(i) <= 90:
            only_alpha += i
        elif ord(i) >= 97 and ord(i) <= 122:
            only_alpha += i
        elif int(i) < 5:
                lst.append("0")
        else:
            lst.append("1")
    res = "".join(lst)
    print(only_alpha+res)

inp = str(input("Enter the String: "))
digits(inp)