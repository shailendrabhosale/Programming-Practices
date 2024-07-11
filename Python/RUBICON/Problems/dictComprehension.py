# Dictionary Comprehension

dict1 = {i:f"Item {i}" for i in range(5)}
dict2 = {a:b for b,a in dict1.items()}
print(dict1)
print(dict2)