import java.io.*;

class Patt9 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");

		int rows = Integer.parseInt(br.readLine());
		int nRows = rows;
		int temp;

		for (int i = 1; i <= rows; i++) {
		
			if (i%2 == 1) {

				for (int j = 1; j <= nRows; j++) {
					
					System.out.print(j + " ");
				}
			}
			else {
				for (int j = nRows; j >= 1; j--) {
				
					temp = 64 + j;
					System.out.print((char)temp + " ");
				}
			}
			nRows--;
			System.out.println();
		}
	}
}
