import java.io.*;

class Patt2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of rows: ");

		int rows = Integer.parseInt(br.readLine());
		int ch = 64 + rows;

		for (int i = 1; i <= rows; i++) {
		
			int temp = i + rows - 1;
			for (int j = 1; j <= rows; j++) {
			
				System.out.print((char)ch);
				System.out.print(temp-- + " ");
			}

			System.out.println();
		}	
	}
}
