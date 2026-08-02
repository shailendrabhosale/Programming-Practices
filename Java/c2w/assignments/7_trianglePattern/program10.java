/* row=3
 *
 * c b a
 * B A
 * a
 *
 * row = 4
 *
 * D C B A
 * c b a
 * B A
 * a	*/


import java.util.*;
class program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();

        int ch1=64+row;
	int ch2=96+row;
        for (int i = 1; i <= row; i++) {

            for (int j=row;j>=i;j--) {
		    if(row%2==1) {
		    	if(i%2==1) {
                		System.out.print((char)ch2-- +" ");

		   	 }	
		  	  else {

                		System.out.print((char)ch1-- +" ");
           		}
           	 }
		 else {
			 if(i%2==0) {
                                System.out.print((char)ch2-- +" ");

                         }
                          else {
		
                                System.out.print((char)ch1-- +" ");
                        }
		 }
          
       		 }
	    ch1=64+row-i;
	    ch2=96+row-i;
            System.out.println();
   	 }
	}
}
