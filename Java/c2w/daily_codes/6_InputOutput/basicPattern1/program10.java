/* Number of rows = 4
 *
 * 1 2 3 4
 * 2 3 4 5
 * 3 4 5 6
 * 4 5 6 7
 *
 * Number of rows = 3
 *
 * 1 2 3
 * 2 3 4
 * 3 4 5        */

import java.util.*;
class program10 {
        public static void main(String args[]) {
                Scanner sc=new Scanner(System.in);
                        System.out.print("Enter no of rows : ");
                        int row = sc.nextInt();

                int num=1;


                for(int i=1;i<=row;i++) {


                        for(int j=1;j<=row;j++) {
                                System.out.print(num++  +" ");
                        }

                        num=i+1;
                        System.out.println();

                }
        }
}
