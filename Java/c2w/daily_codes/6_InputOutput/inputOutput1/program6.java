/* Write a program to take a range as input from the user
 * and print the numbers between them
 *
 * i/p 1    num1=5
 *          num2=16
 *
 * o/p      5,6,7,8.....,16  */

/*import java.util.*;
class program6 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the first number in range : ");
                	int num1 = sc.nextInt();
		System.out.print("Enter the second number in range :");
			int num2 = sc.nextInt();
		
                for(; num1<=num2; num1++) {
                        System.out.print(num1 +",");
                }
        }
} */

import java.util.*;
class program6 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the first number in range : ");
                        int num1 = sc.nextInt();
                System.out.print("Enter the second number in range :");
                        int num2 = sc.nextInt();

                for(int i=num1; i<=num2; i++) {
                        System.out.print(i +",");
                }
		System.out.println();
        }
}
