/* rows = 4
 *
 * 1
 * B C
 * 1 2 3
 * G H I J
 *
 * row=3
 *
 * 1
 * B C
 * 1 2 3   */

import java.io.*;
class program6 {
        public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter no of rows :");
                int row = Integer.parseInt(br.readLine());

		char ch='A';
                for(int i=1;i<=row;i++) {

                        for(int j=1;j<=i;j++) {

                                if(i%2==1) {
                                        System.out.print(j +" ");
                                        ch++;
                                 }

                                else {
                                        System.out.print(ch +" ");
                                        ch++;
                                }
                        }
                        System.out.println();
                }
        }
}
