class Student():
    def department(self, nameDpt, floorDpt, staffDpt, hodDpt):
        self.nameDpt = nameDpt.input("Enter your Department Name: ")
        self.floorDpt = floorDpt.input("Enter floor no:")
        self.staffDpt = staffDpt.int(input("Enter staff members: "))
        self.hodDpt = hodDpt.input("Kaun hai Hod?? : ")

    def library(self, secLIB, floorLIB, booksLIB, rpLIB):
        
        self.secLIB = secLIB.input("Enter section of library: ")
        self.floorLIB = floorLIB.int(input("Enter the floor no: "))
        self.booksLIB = booksLIB.int(input("Enter the number of books: "))
        self.rpLIB = rpLIB.int(input("Enter the number of Research Papers: "))
    
a=Student()
print(a.department)
print(a.library)