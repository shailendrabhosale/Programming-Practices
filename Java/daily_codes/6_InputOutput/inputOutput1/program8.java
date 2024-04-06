/* Write a program to take a range as input
 * from the user and print the sum of the numbers
 * in the range.
 *
 * i/p1    num1=5
 * 	   num2=7
 * o/p     18       */

import java.util.*;
class program8 {
        public static void main(String args[]) {
		//int sum=0;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the first number in range : ");
                        int num1 = sc.nextInt();
                System.out.print("Enter the second number in range :");
                        int num2 = sc.nextInt();
		int sum=0;
                for(int i=num1; i<=num2; i++) {
                        sum+=i;
                }
                System.out.println(sum);
        }
}
