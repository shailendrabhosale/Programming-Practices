import java.io.*;

class Patt8 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of rows: ");

		int rows = Integer.parseInt(br.readLine());
		int temp = 64;

		// Loop for number iteration
		for (int t = rows; t >= 1; t--) {
		
			temp += t;
		}
		//System.out.print(temp);

		for (int i = rows; i >= 1; i--) {
		
			for (int j = 1; j <= i; j++) {
			
				System.out.print((char)temp-- + " ");
			}

			System.out.println();
		}
	}
}
