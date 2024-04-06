/* row = 4
 *
 * 2 4 6 8
 * 10 12 14
 * 16 18
 * 20
 *
 * row = 5
 *
 * 2 4 6 8 10
 * 12 14 16 18
 * 20 22 24
 * 26 28
 * 30	*/

import java.util.*;
class program2 {
        public static void main(String args[]) {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter no of rows: ");
                int row=sc.nextInt();

                int num=2;
                for(int i=1;i<=row;i++) {
                        
                        for(int j=row;j>=i;j--) {
                                System.out.print(num +" ");
				num+=2;
                        }
                        System.out.println();
                }
        }
}
