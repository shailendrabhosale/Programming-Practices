/* Number of rows = 4
 *
 * d c b a
 * d c b a
 * d c b a
 * d c b a
 *
 *
 * Number of rows = 3
 *
 * c b a
 * c b a
 * c b a           */

import java.util.*;
class program8 {
        public static void main(String args[]) {
                Scanner sc=new Scanner(System.in);
                        System.out.print("Enter no of rows : ");
                        int row = sc.nextInt();

                for(int i=1;i<=row;i++) {
			int ch=row+96;

                        for(int j=1;j<=row;j++) {
                                System.out.print((char)ch--  +" ");

                        }

                        System.out.println();

                }
        }
}
