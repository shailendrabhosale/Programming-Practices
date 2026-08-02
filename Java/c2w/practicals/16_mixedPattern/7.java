import java.io.*;

class Patt7 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of rows: ");

		int rows = Integer.parseInt(br.readLine());
		int t = 0;

		for (int i = rows; i >= 1; i--) {
		
			for (int j = 1; j <= i; j++) {
			
				t += 2;
				System.out.print(t + " ");
			}
			System.out.println();
		}
	}
}
