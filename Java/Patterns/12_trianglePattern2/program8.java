/* row=3
 * 1
 * 1 c
 * 1 e 3
 *
 * row=4
 * 1
 * 1 c
 * 1 e 3
 * 1 g 3 i	*/

import java.io.*;
class program8 {
        public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter no of rows :");
                int row = Integer.parseInt(br.readLine());

                char ch='c';
                for(int i=1;i<=row;i++) {

                        for(int j=1;j<=i;j++) {

                                if(j%2==1) {
                                        System.out.print(j +" ");
                                        
                                 }

                                else {
                                        System.out.print(ch +" ");
                                        ch+=2;
                                }
                        }
                        System.out.println();
                }
        }
}
