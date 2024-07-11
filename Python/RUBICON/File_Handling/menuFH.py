print("File Handling Operations!!\n\n")
print("1) ")
n = int(input("Enter your Choice: "))

for i in range(n):
    f = open("D:/SHAILU/prog_practices/Python/RUBICON/File_Handling/fhDemo2.txt", "w")
    for i in range(n):
        f.write("Hello\n")