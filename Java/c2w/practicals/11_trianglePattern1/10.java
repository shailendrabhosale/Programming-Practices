import java.io.*;

class Demo10 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter rows: ");

		int rows = Integer.parseInt(br.readLine());
		int a;

		for (int i = 1; i <= rows; i++) {
		
			a = 64+i;
			for (int j = rows; j >= i; j--) {
			
				if (rows%2==1)			
					if (a%2==1)
						System.out.print((char)a + " ");
					else
						System.out.print(a + " ");
				else
					if (a%2==1)
						System.out.print(a + " ");
					else
						System.out.print((char)a + " ");
		
				a++;
			}
			System.out.println();	
		}
	}
}
