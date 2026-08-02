/* Write a program to take a marks of four subjects
 * from the user and print the total obtained marks
 * out of total.(100 marks each subjects)
 *
 * i/p	math=95
 * 	english=96
 * 	science=99
 * 	marathi=97
 *
 * o/p	387 out of 400    */

import java.util.*;
class program10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter the marks of maths :");
			int math=sc.nextInt();

			System.out.print("Enter the marks of english :");
                        int eng=sc.nextInt();

			System.out.print("Enter the marks of science :");
                        int sci=sc.nextInt();

			System.out.print("Enter the marks of marathi :");
                        int mar=sc.nextInt();

			int sum=math+eng+sci+mar;
			
			System.out.print(sum+" out of 400");
			System.out.println();

	}
}


			

