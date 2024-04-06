/* Write a program to take a number as a input from
 * the user and check whether the number is divisible 
 * by 8 or not.
 *
 * i/p 1   num=24
 * o/p     24 is divisible by 8
 *
 * i/p 2   num=45
 * o/p     26 is not divisible by 8  */

import java.util.*;
class program3 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");
                int num = sc.nextInt();

                
                if(num%8==0) {
                        System.out.println(num+" is divisible by 8");
                }
                else {
                        System.out.println(num+" is not divisible by 8");
                }
        }
}
