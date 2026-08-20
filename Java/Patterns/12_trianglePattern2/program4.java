/* row = 3
 *
 * c
 * C B
 * c b a
 *
 * row=4
 *
 * d
 * D C
 * d c b
 * D C B A	*/


import java.io.*;
class program4 {
        public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter no of rows :");
                int row = Integer.parseInt(br.readLine());

                
                for(int i=1;i<=row;i++) {

			int ch1=64+row;
			int ch2=96+row;

                        for(int j=1;j<=i;j++) {

                                if(i%2==1) {
                                        System.out.print((char)ch2 +" ");
					ch2--;
                                 }

                                else {
                                        System.out.print((char)ch1+" ");
					ch1--;
                                }
                        }
                        System.out.println();
                }
        }
}          
