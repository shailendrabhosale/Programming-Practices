/* row =4 
 *
 * 19 17 15 13
 * 11 9 7
 * 5 3
 * 1
 *
 * row=5
 *
 * 29 27 25 23 21
 * 19 17 15 13
 * 11 9 7
 * 5 3
 * 1		*/

import java.util.*;
class program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();

	int num=row*row + (row-1);
        for (int i = 1; i <= row; i++) {
            
            for (int j=row;j>=i;j--) {
                System.out.print(num +" ");
		num-=2;
            }
	    System.out.println();
	}
    }
}

            
