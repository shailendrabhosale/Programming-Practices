import java.io.*;

class Patt6 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of rows: ");

		int rows = Integer.parseInt(br.readLine());
		int t;

		for (int i = 1; i <= rows; i++) {
		
			t = rows;
			for (int j = 1; j <= i; j++) {
			
				if(i%2==1) {
				
					t += 96;
					System.out.print((char)t + " ");
					t -= 96;
				}
				else {
				
					System.out.print(t + " ");
				}
				t--;
			}
			System.out.println();
		}
	}
}
