/* rows = 3
 *
 * 9
 * 9 9
 * 9 9 9
 *
 * rows = 4
 *
 * 16
 * 16 16
 * 16 16 16
 * 16 16 16 16  */

import java.io.*;
class program1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter no of rows :");
		int row = Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(row*row +" ");
			}
			System.out.println();
		}
	}
}

