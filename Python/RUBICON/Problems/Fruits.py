FruitsB = []

def fruits():
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
fruits()