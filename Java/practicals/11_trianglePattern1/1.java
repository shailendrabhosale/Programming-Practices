import java.io.*;

class Demo1 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());
		
		int num = 1;

		for (int i=1; i <= rows; i++) {
					
			num = 1;
			for (int j=1; j <= i; j++) {
			
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}
