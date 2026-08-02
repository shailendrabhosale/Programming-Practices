/* Write a program to take the range from the user 
 * and print the even numbers 
 *
 * i/p 1	num1=5
 * 		num2=16
 *
 * o/p		6,8,10,12,14,16   */

import java.util.*;
class program9 {
        public static void main(String args[]) {
                //int sum=0;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the first number in range : ");
                        int num1 = sc.nextInt();
                System.out.print("Enter the second number in range :");
                        int num2 = sc.nextInt();
                
                for(int i=num1; i<=num2; i++) {
                        if(i%2==0) {
				System.out.print(i +",");
			}
                }
                System.out.println();
        }
}
