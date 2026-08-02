/* row = 3
 * 4
 * 4 a
 * 4 b 6
 *
 * row = 4
 * 5
 * 5 a
 * 5 b 7
 * 5 c 7 d	*/

import java.io.*;
class program9 {
        public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter no of rows :");
                int row = Integer.parseInt(br.readLine());

                int num=row+1;
		char ch='a';
                for(int i=1;i<=row;i++) {

                        for(int j=1;j<=i;j++) {
				

                                if(j%2==1) {
                                        System.out.print(num +" ");
                                        num++;
					
                                 }

                                else {
                                        System.out.print(ch++ +" ");
                                        num++;
                                }
                        }
			num=row+1;
                        System.out.println();
                }
        }
}
