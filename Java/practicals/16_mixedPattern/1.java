import java.io.*;

class Patt1 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of rows: ");

		int rows = Integer.parseInt(br.readLine());
		int num = 1;

		for (int i = 1; i <= rows; i++) {
		
			for (int j = 1; j <= rows; j++) {
			
				System.out.print(num++ + " ");
			}
			
			System.out.println();
		}

	}
}
