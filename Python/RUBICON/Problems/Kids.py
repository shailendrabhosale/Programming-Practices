KidsB = []

def kidsItem():
    print("\nTodays list of Fruits:-")

    while(True):
        print("\n\t1) Toy-Car")
        print("\t2) Football")
        print("\t3) Choclates")
        print("\t4) Video-Games")
        print("\nTo Cancel the Order, press 5.")

        ansV = int(input("Which fruits do you want: "))

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
kidsItem()