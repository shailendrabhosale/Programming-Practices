/* Write a program to take a number as input
 * from the user and print the reverse table 
 * of it
 *
 *
 * i/p 1    num = 9
 * o/p      90,81,72......,9  */

import java.util.*;
class program7 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");
                int num = sc.nextInt();

                for(int i=10; i>=1; i--) {
                        System.out.print(num*i +",");
                }
        }
}
