/* row = 4
 *
 * 4 c 2 a
 * 3 b 1
 * 2 a
 * 1
 *
 *row = 5

 5 d 3 b 1
 4 c 2 a
 3 b 1
 2 a
 1	 */

import java.util.*;
class program7 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter no of rows: ");
                int row=sc.nextInt();

                int ch = 96+row;
                int num=row;

                for(int i=1;i<=row;i++) {
			//int num=row;
			//int ch=64+row;			
                        for(int j=row;j>=i;j--) {

                                if(row%2==1) {

                                        if(j%2==1) {

                                                System.out.print(num +" ");
					
						num--;
						ch--;
                                        }
                                        else  {
                                                System.out.print((char)ch +" ");
						
						num--;
						ch--;
                                        }
				}

				else {

					if(j%2==0) {

                                                System.out.print(num +" ");

                                                num--;
                                                ch--;
                                        }
                                        else  {
                                                System.out.print((char)ch +" ");

                                                num--;
                                                ch--;
                                        }
				}
					 
                       }
		        ch=(96+row)-i;
       			num=row-i;			       
                        System.out.println();
                  }
        }
} 
