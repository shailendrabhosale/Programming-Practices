a=int(input("Enter any number: "))
b=int(input("Enter another number:"))
print("")
print("\t****MENU****")
print("1) Addition\n2) Substraction\n3) Multiplication\n4) Division")
print("")
op=int(input("Enter your choice: "))

while op!='5':   
    if op=='1':
            c=a+b
            print(a,"+",b,"=",c)
    elif op=='2':
        c=a+b
        print(a,"-",b,"=",c)
    elif op=='3':
        c=a+b
        print(a,"*",b,"=",c)
    elif op=='4':
        c=a+b
        print(a,"/",b,"=",c)
    else:
        print("Wrong Choice!!!")
        op=5
print("Exiting!!!")
