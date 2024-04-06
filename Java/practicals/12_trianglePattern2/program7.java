/* rows = 3
 * 1
 * 2 a
 * 3 b 3
 *
 * row = 4
 * 1
 * 2 a
 * 3 b 3
 * 4 c 4 d	*/

import java.io.*;
class program7 {
        public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter no of rows :");
                int row = Integer.parseInt(br.readLine());

                char ch='a';
                for(int i=1;i<=row;i++) {

                        for(int j=1;j<=i;j++) {

                                if(j%2==1) {
                                        System.out.print(i +" ");
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
