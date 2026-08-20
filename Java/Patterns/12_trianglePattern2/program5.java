/* rows = 3
 *
 * D
 * E F
 * G H I
 *
 * row = 4
 *
 * E
 * F G
 * H I J
 * K L M N	*/

import java.io.*;
class program5 {
        public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter no of rows :");
                int row = Integer.parseInt(br.readLine());
		
		int ch=65+row;
                for(int i=1;i<=row;i++) {

                        for(int j=1;j<=i;j++) {       
                               System.out.print((char)ch +" ");
			       ch++;
                        }
                        System.out.println();
                }
        }
}
