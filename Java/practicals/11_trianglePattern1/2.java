import java.io.*;

class Demo2 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter rows: ");

		int rows = Integer.parseInt(br.readLine());
		int t = rows;
		for (int i=1; i <= rows; i++) {
		
			t = rows;
			for (int j=1; j <= i; j++) {
			
				System.out.print(t-- + " ");
			}
			System.out.println();
		}
	}
}
