/* 1A 1A 1A
 * 1A 1A 1A
 * 1A 1A 1A  */

import java.util.*;
class program6 {
        public static void main(String args[]) {
                Scanner sc=new Scanner(System.in);
                        System.out.print("Enter no of rows : ");
                        int row = sc.nextInt();

                int num=1;
		char ch='A';

                for(int i=1;i<=row;i++) {


                        for(int j=1;j<=row;j++) {
                                System.out.print(""+num+ch  +" ");

                        }

                        System.out.println();

                }
        }
}
