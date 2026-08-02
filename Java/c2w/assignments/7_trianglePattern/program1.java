/* row = 4
 *
 * 1 2 3 4
 * 2 3 4
 * 3 4
 * 4
 *
 * row = 5
 *
 * 1 2 3 4 5
 * 2 3 4 5
 * 3 4 5
 * 4 5 
 * 5  	*/

import java.util.*;
class program1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int row=sc.nextInt();
		
		int num=1;
		for(int i=1;i<=row;i++) {
			num=i;
			for(int j=row;j>=i;j--) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}
