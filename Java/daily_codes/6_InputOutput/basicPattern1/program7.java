/* 1A 2B 3C
 * 1A 2B 3C 
 * 1A 2B 3C */



import java.util.*;
class program7 {
        public static void main(String args[]) {
                Scanner sc=new Scanner(System.in);
                        System.out.print("Enter no of rows : ");
                        int row = sc.nextInt();

                for(int i=1;i<=row;i++) {
			int num=1;
			char ch='A';

                        for(int j=1;j<=row;j++) {
                                System.out.print(""+num++ + ch++  +" ");

                        }

                        System.out.println();

                }
        }
}
