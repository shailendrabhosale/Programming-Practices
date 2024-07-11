def addName():
    name = input("Enter your name: ")
    sirname = input("Enter your sirname: ")
    print()
    print(f"Your name: {name}, Your Sirname: {sirname}")

print("Do you want to add your name??")
ans = int(input("Enter choice [1/0]: "))

if(ans == 1):
    addName()
else:
    print("BYE BYE !!!")