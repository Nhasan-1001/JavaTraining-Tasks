#Disemvowel Trolls

def disemvowel(string_):
    vowels = "aeiouAEIOU"
    for i in vowels:
        string_ = string_.replace(i,"")
    return string_