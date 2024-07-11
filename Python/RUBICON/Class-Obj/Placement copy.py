class Student:
    def __init__(self, studentID, studentName, studentDept):
        self.StudentID = studentID
        self.StudentName = studentName
        self.studentDept = studentDept

class Placement(Student):
    def __init__(self, studentID, studentName, studentDept, companyName, package, intake):
        super().__init__(studentID, studentName, studentDept)
        self.companyName = companyName
        self.package = package
        self.intake = intake

    def display_placement_details(self):
        print(f"Student ID: {self.StudentID}")
        print(f"Student Name: {self.StudentName}")
        print(f"Department: {self.studentDept}")
        print(f"Company Name: {self.companyName}")
        print(f"Package: {self.package}")
        print(f"Intake: {self.intake}")

# Example usage
student1 = Placement(studentID="S123", studentName="Alice", studentDept="Computer Science",
                     companyName="TechCorp", package="10 LPA", intake="2022")
student1.display_placement_details()
