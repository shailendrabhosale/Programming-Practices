/* row=4;
 *
 * D
 * D C
 * D C B
 * D C B A
 *
 * row=3
 *
 * D
 * D C
 * D C B  */

import java.io.*;
class program3 {
        public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter no of rows :");
                int row = Integer.parseInt(br.readLine());

                for(int i=1;i<=row;i++) {
			int ch = 64+row; 
                        for(int j=1;j<=i;j++) {
                                System.out.print((char)ch +" ");
				ch--;
                        }
                        System.out.println();
                }
        }
}
