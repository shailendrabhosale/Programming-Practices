name = input("Enter name: ")
sirname = input("Enter sirname: ")
eid = int(input("Enter empID: "))
email = input("Enter email: ")

class abc():
    def _init_(self,name,surname,eid,email):
        self.name=name
        self.surname=surname
        self.email=email
        self.eid=eid

    def fun1(self):
        print(f"{self.name},{self.sirname},{self.eid},{self.email}")

a=abc()
print(a.fun1)
a.fun1
