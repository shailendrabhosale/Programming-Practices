import java.io.*;

class Demo2 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter any number: ");
		int num = Integer.parseInt(br.readLine());
		int i;

		System.out.print(num + " is");

		for (i = num; i >= 1; i--) {
		
			if (num%i == 0 && i != 1)
				break;
		}
		if (i == 0)
			System.out.println(" a prime number!");
		else
			System.out.println(" not a prime number!");
	}
}
