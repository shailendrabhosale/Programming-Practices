/* Write aprogram to take a number as an input 
 * from the user and print its table
 *
 * i/p 1    num=9
 * o/p      9,18,27......90  */

import java.util.*;
class program4 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");
                int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.print(num*i +",");
		}
        }
}
