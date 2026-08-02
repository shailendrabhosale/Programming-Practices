import java.io.*;

class Demo56 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter any number: ");
		int num = Integer.parseInt(br.readLine());
		int fact = num;

		for (int i = num-1; i >= 1; i--) {
		
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact + ".");
	}
}
