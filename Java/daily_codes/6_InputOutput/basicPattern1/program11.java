import java.util.*;
class program11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int row = sc.nextInt();

		System.out.print("Enter no of columns : ");
                int column = sc.nextInt();
		
		int num=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				System.out.print(num +" ");
				num=num+2;
			}
			System.out.println();
		}
	}
}
