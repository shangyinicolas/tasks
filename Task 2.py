def most_number(one_string):
    one_string=one_string.lower()
    str_dict = {}
    for item in one_string:
        if item in str_dict:
            str_dict[item] +=1
        else:
            str_dict[item] =1
    str_dict = {str_dict[key]:key for key in str_dict}
    return (str_dict[max(str_dict)])
    
i="aaaAAAsvsasdss"
print(most_number(i))



