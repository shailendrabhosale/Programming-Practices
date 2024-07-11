class Student():

    def __init__(self, studentID, studentName, studentDept):
        self.StudentID = int(input("Enter student ID: "))
        self.StudentName = input("Enter student name: ")
        self.studentDept = input("Enter student department: ")

class Placement(Student):

    def __init__(self, studentID, studentName, studentDept, companyName, package, intake):
        self.companyName = input("Enter Company Name: ")
        self.package = input("Enter company package: ")
        self.intake = input("Enter company's intake: ")
        
class Admin(Placement):
    def __init__(self, studentID, studentName, studentDept, companyName, package, intake):
        super().__init__(studentID, studentName, studentDept, companyName, package, intake)