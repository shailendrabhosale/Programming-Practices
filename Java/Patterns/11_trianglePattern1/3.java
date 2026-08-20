import java.io.*;

class Demo3 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter rows: ");

		int rows = Integer.parseInt(br.readLine());
		int t;
		for (int i=1; i <= rows; i++) {
		
			t=64+i;
			for (int j=1; j <= i; j++) {
			
				System.out.print((char)t++ + " ");
			}
			System.out.println();
		}
	}
}
