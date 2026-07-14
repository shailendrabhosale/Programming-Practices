import java.util.Scanner;

class ForEachLoop {

	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements in array: ");
		int n = sc.nextInt();

		int nums[] = new int[n];

		System.out.print("Enter array elements: ");

		for (int i = 0; i < n; i++) {
		
			nums[i] = sc.nextInt();
		}

		System.out.println("Entered array: ");

		for (int i : nums) {
		
			System.out.print(i + " ");
		}
	}
}
