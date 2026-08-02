/* Write a program to take a number as a input 
 * from the user and check whether the number is
 * even or odd
 *
 * input 1:  num=26
 * o/p       26 is an even number
 *
 * input 2:  num=45
 * o/p       45 is an odd number      */

import java.util.*;
class program1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		if(num%2==0) {
			System.out.print(num+" is an even number");
		}

		else {
			System.out.print(num+" is an odd number");
		}
		System.out.println("");
	}
}
