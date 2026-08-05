/* row = 3
 *
 * A B C
 * a b 
 * A
 *
 * row = 4
 *A B C D
  a b c
  A B
  a	*/
 
import java.util.*;
class program5 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter no of rows: ");
                int row=sc.nextInt();

                
                for(int i=1;i<=row;i++) {
                	int ch1 = 65;
			int ch2 = 97;
                        for(int j=row;j>=i;j--) {

				if(i%2==1) {
                                	System.out.print((char)ch1 +" ");
                               	 	ch1++;
                       		 }
				 
				else {
					System.out.print((char)ch2 +" ");
					ch2++;
				}
                        
               		 }
                	System.out.println();
       		 }
	}
}
