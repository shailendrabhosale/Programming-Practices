import java.io.*;

class Patt4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter numer of rows: ");

		int rows = Integer.parseInt(br.readLine());
		int temp = 1;

		for (int i = rows; i >= 1; i--) {
		
			int t = 0;

			for (int j = 1; j <= temp; j++) {
			
				t += i;
				System.out.print(t + " ");
			}
				
			temp++;
			System.out.println();
		}
	}
}
