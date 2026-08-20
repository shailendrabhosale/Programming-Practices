import java.io.*;

class Demo8 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter rows: ");

		int rows = Integer.parseInt(br.readLine());
		int temp = rows;

		for (int i=1; i <= rows; i++) {
		
			int a = i;
			for (int j = temp--; j >= 1; j--) {
			
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}
}
