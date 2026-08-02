import java.io.*;

class Demo1 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter any number: ");
		int num = Integer.parseInt(br.readLine());

		System.out.print("Factors of " + num + " are ");

		for (int i = 1; i <= num; i++) {
		
			if (num%i == 0 && num == i)
				System.out.print("and " + i);
			else if (num%i == 0)
				System.out.print(i);

			if (num == i)
				System.out.println(". ");
			else if (num%i == 0)
				System.out.print(", ");
		}
		
	}
}
