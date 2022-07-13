#Find the missing letter

def find_missing_letter(chars):
    alphabets = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
    match = False
    count = 0;
    for char in alphabets:
        if char == chars[count]:
            match = True
            count += 1
        elif match == True:
            return char
    return