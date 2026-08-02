import java.io.*;

class Demo9 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter rows: ");

		int rows = Integer.parseInt(br.readLine());
		int temp = rows;
		int a;

		for (int i = 1; i <= rows; i++) {
		
			a = 64+rows;
			for (int j = temp--; j >= 1; j--) {
			
				System.out.print((char)a-- + " ");
			}
			System.out.println();
		}
	}
}
