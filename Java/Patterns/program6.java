/*row = 3
 *
 * 1 a 2
 * 1 a
 * 1
 *
 * row = 4
 *
 * 1 a 2 b
 * 1 a 2
 * 1 a
 * 1	*/

import java.util.*;
class program6 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter no of rows: ");
                int row=sc.nextInt();

                
                for(int i=1;i<=row;i++) {
                char ch = 'a';
		int num=1;
                        for(int j=row;j>=i;j--) {
				
				if(row%2==1) {
					if(j%2==1) {
					
                                		System.out.print(num++ +" ");	
					}
					else {
                                		System.out.print(ch++ +" ");
					}
                	        }
			
			
				else {
				
                                        if(j%2==0) {

                                                System.out.print(num++ +" ");
                                        }
                                        else {
                                                System.out.print(ch++ +" ");
                                        }
                          	}
               		 }
			System.out.println();
      		  }
	}
}
