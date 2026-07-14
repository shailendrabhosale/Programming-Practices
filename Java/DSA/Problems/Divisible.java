import java.util.*;

class Divisible {

	public static void divide(int n) {
	
		System.out.println("All divisible numbers: ");
		for (int i = n; i <= 100; i++) {
		
			if (i%n == 0) {
			
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the divisible number: ");
		int n = sc.nextInt();

		divide(n);
	}
}
