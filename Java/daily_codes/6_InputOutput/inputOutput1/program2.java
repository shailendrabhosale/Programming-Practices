/* Write a program to take the age of the voter from the 
 * user where the age should be positive and check whether he
 * is eligible for voting.(that means no negative values are allowed)
 *
 *
 * i/p 1    age=15
 * o/p      voter is not eligible for voting
 *
 * i/p 2    age= -16
 * o/p      invalid age
 *
 * i/p3     age = 18
            voter is eligible for voting       */

import java.util.*;
class program2 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the age : ");
                int age = sc.nextInt();

                if(age>0) {
                        if(age>=18) {
				System.out.println("Voter is eligible for voting");
			}
			else {
				System.out.println("Voter is not eligible for voting");
			}

	
		}

		else {
                        System.out.println("Invalid age");
                }
        }
}
