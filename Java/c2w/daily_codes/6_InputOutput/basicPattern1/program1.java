/* $# $# $# 
 * $# $# $# 
 * $# $# $#     */

import java.util.*;
class program1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter no of rows : ");
			int row = sc.nextInt();

		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				System.out.print(" $# ");
			}
			
			System.out.println();
			
			
		}
	}
}
