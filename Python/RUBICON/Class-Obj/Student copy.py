class Student:
    def department(self, nameDpt, floorDpt, staffDpt, hodDpt):
        self.nameDpt = input("Enter your Department Name: ")
        self.floorDpt = int(input("Enter floor no: "))
        self.staffDpt = int(input("Enter staff members: "))
        self.hodDpt = input("Kaun hai Hod?? : ")

    def library(self, secLIB, floorLIB, booksLIB, rpLIB):
        self.secLIB = input("Enter section of library: ")
        self.floorLIB = int(input("Enter the floor no: "))
        self.booksLIB = int(input("Enter the number of books: "))
        self.rpLIB = int(input("Enter the number of Research Papers: "))

a = Student()
a.department(None, None, None, None)  # Call the department method
a.library(None, None, None, None)      # Call the library method

print("\n\t")
print(f"Department Name: {a.nameDpt}")
print(f"Floor Number: {a.floorDpt}")
print(f"Staff Members: {a.staffDpt}")
print(f"HOD: {a.hodDpt}")

print(f"Library Section: {a.secLIB}")
print(f"Library Floor: {a.floorLIB}")
print(f"Number of Books: {a.booksLIB}")
print(f"Number of Research Papers: {a.rpLIB}")
