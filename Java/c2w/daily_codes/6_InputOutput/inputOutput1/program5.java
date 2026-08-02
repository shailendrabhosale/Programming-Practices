/* Write a program to take a number from user
 * and check whether the number is present in
 * the table of 16 or not
 *
 * i/p1   num=32
 * o/p    32 is present in the table of 16
 *
 * i/p2   num=45
 * o/p    45 is not present in the table of 16  */

import java.util.*;
class program5 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");
                int num = sc.nextInt();
		
		if(num<160) {
                	if(num%16==0) {
                        	System.out.println(num+" is present in the table of 16");
                	}
                	else {
                        	System.out.println(num+" is not present in the table of 16");
                	}
		}
		else {
			System.out.println(num+" is not present in the table of 16");
		}

        }
}
