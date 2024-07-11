dict = {}
n = int(input("Enter the dictionary range: "))
print("Enter the number::square below:-")
print()
for i in range(n):
    x=int(input("Number: "))
    y=int(input("Square: "))
    dict.update({x:y})
print(dict)