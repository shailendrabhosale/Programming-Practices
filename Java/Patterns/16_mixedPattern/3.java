import java.io.*;

class Patt3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of rows: ");

		int rows = Integer.parseInt(br.readLine());

		for (int i = 1; i <= rows; i++) {
			
			int temp = 64 + rows;
			for (int j = 1; j <= rows; j++) {
			
				if (i%2 == 1)
					System.out.print((char)temp-- + " ");
				else
					System.out.print(j + " ");
			}

			System.out.println();
		}	
	}
}
