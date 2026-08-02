import java.util.*;
class program1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter College name:");
		String clgName=sc.next();
		System.out.println("Enter Student id:");
		int studId=sc.nextInt();
		System.out.println("Enter CGPA:");
		float marks=sc.nextFloat();

		System.out.println("Student Name: "+name);
		System.out.println("College Name: "+clgName);
		System.out.println("ID: "+studId);
		System.out.println("Marks: "+marks);
	}
}
