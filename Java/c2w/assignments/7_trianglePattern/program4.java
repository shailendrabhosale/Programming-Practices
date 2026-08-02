/* row = 3
 *
 * F E D
 * C B
 * A
 *
 * row = 4
 *
 * J I H G
 * F E D
 * C B
 * A	*/

import java.util.*;
class program4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int row=sc.nextInt();
		
		int ch = row*2 + 64;
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print((char)ch +" ");
				ch--;
			}
			System.out.println();
		}
	}
}
