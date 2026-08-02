import java.util.*;

public class BubbleSort1 {

	
	static void bubbleSort(int arr[]) {
	
		int n = arr.length;
		
		// Function to perform Bubble Sort
		for (int i = 0; i < n; i++) {
		
			// Outer loop for passes
			for (int j = 0; j < n - i - 1; j++) {
			
				//Inner loop for comparision
				if (arr[j] > arr[j+1]) {
				
					// Swap if elements are in wrong order
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");

		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements below");

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		bubbleSort(arr);
		System.out.print("Sorted Array: ");

		for (int num : arr)
			System.out.print(num + " ");
		System.out.println("");
	}
}
