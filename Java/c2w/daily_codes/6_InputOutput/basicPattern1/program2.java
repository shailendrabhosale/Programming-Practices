/* 1 2 3
 * 1 2 3
 * 1 2 3 */

import java.util.*;
class program2 {
        public static void main(String args[]) {
                Scanner sc=new Scanner(System.in);
                        System.out.print("Enter no of rows : ");
                        int row = sc.nextInt();

                for(int i=1;i<=row;i++) {

			int num=1;
                        for(int j=1;j<=row;j++) {
                                System.out.print(num++ +" ");
				
                        }

                        System.out.println();


                }
        }
}
