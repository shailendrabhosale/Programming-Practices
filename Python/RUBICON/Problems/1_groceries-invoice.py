"""
1. Create a function of a groceries store where you need to add vegetable fruits household items & kids items.
You will provide user choices to add groceries & the groceries chosen by the user should be appended to the final groceries list.
When the user confirms the groceries list, the output should be present in the form of bill where invoice generated 
is to be shown as grocery/product name/product price/ inr rupees.
"""

def kidsItem():
        
    KidsB = []
    print("\nTodays list of Fruits:-")

    while(True):
        print("\n\t1) Toy-Car")
        print("\t2) Football")
        print("\t3) Choclates")
        print("\t4) Video-Games")
        print("\nTo Cancel the Order, press 5.")

        ansV = int(input("Which item do you want: "))

        if(ansV == 1):
            KidsB.append('Toy-Car')
        elif(ansV == 2):
            KidsB.append("Football")
        elif(ansV == 3):
            KidsB.append("Choclates")
        elif(ansV == 4):
            KidsB.append("Video-Games")
        elif(ansV == 5):
            break
        else:
            print("Wrong Entry!!!!")
            break
    print(KidsB)

def fruits():

    FruitsB = []
    print("\nTodays list of Fruits:-")

    while(True):
        print("\n\t1) Mango")
        print("\t2) Bananas")
        print("\t3) Strawberry)")
        print("\t4) Pineapple")
        print("\nTo Cancel the Order, press 5.")

        ansV = int(input("Which fruits do you want: "))

        if(ansV == 1):
            FruitsB.append('Mango')
        elif(ansV == 2):
            FruitsB.append("Bananas")
        elif(ansV == 3):
            FruitsB.append("Strawberry")
        elif(ansV == 4):
            FruitsB.append("Pineapple")
        elif(ansV == 5):
            break
        else:
            print("Wrong Entry!!!!")
            break
    print(FruitsB)


def vegetables():

    VegiesB = []
    print("\nTodays list of Vegetables:-")

    while(True):
        print("\n\t1) Bhendi")
        print("\t2) Gawari")
        print("\t3) Baingan(Wanga)")
        print("\t4) Batata")
        print("\nTo Cancel the Order, press 5.")

        ansV = int(input("Which vegetable do you want: "))

        if(ansV == 1):
            VegiesB.append('Bhendi')
        elif(ansV == 2):
            VegiesB.append("Gawari")
        elif(ansV == 3):
            VegiesB.append("Baingan")
        elif(ansV == 4):
            VegiesB.append("Batata")
        elif(ansV == 5):
            break
        else:
            print("Wrong Entry!!!!")
            break
    print(VegiesB)

