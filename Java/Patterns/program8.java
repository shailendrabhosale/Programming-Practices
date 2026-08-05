/*row= 4
 *
 * 4 3 2 1
 * C B A
 * 2 1
 * A
 *
 * row =5
 *
 * 5 4 3 2 1
 * D C B A
 * 3 2 1
 * B A
 * 1	*/

import java.util.*;
class program8 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter no of rows: ");
                int row=sc.nextInt();

                int ch = 64+row;
                int num=row;

                for(int i=1;i<=row;i++) {
                        
                        for(int j=row;j>=i;j--) {
				if(i%2==1) {
					System.out.print(num-- +" ");
				}
				else {
					System.out.print((char)ch-- +" ");
				}
			}
			num=row-i;
			ch=(64+row)-i;

			System.out.println();
		}
	}
}
					
