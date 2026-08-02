import java.io.*;

class Patt5 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of rows: ");

		int rows = Integer.parseInt(br.readLine());

		for (int i = 1; i <= rows; i++) {
		
			int t = 0;
			for (int j = 1; j <= i; j++) {
			
				t += i;
				System.out.print(t + " ");
			}

			System.out.println();
		}
	}
}
