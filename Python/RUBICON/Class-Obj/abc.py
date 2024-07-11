class abc():
    def _init_(self,name,surname,eid,email):
        self.name=name
        name=input("Enter name:") #input from user
        self.surname=surname
        surname=input("Enter surname:")
        self.email=email
        name=input("Enter email:")
        self.eid=eid
        name=int(input("Enter Id:"))

    def fun1(self,name,surname,eid,email):
        print(f"my name is {self.name}")
        print(f"my surname is {self.surname}")
        print(f"ID is {self.eid}")
        print(f"my email_id is {self.email}")

a=abc("","Bhosale",5,"shailendra@gmail.com")
a.fun1(print())

