lst = [10, 20, 30, 40]
"""
def lstINS():
    print("Enter the element you want to insert:")
    lst.insert()
""" 

def lstRESP():
    lst = [10, 20, 30, 40]
    print("The list is now respawned!!\n")

def lstPOP():
    lst.pop()
    print("The latest element is out of the list!!\n")

def lstREV():
    lst.reverse()
    print("The list is now reversed!!\n")

def lstCLR():
    print("The list is now Empty!!\n")
    lst.clear()


print("Welcome to the LIST operations!!!\n")

while(True):

    print("List =", lst)
    print("Enter your choice of operation: ")
    print("\n\t1. Pop the element")
    print("\n\t2. Reverse the list")
    print("\n\t3. Clear the list")
    print("\n\t4. Respawn the list")
    print("\n\t5. EXIT!!")

    ans = int(input("Enter your Choice: "))

    if(ans == 1):
        lstPOP()
    elif(ans == 2):
        lstREV()        
    elif(ans == 3):
        lstCLR()
    elif(ans == 4):
        lstRESP()
    elif(ans == 5):
        print("Exiting the Program!!!")
        break
    else:
        print("Wrong Entry!!!")
        break