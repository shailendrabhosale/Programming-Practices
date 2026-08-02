import java.io.*;

class Demo910 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter any number: ");
		int num = Integer.parseInt(br.readLine());
		int rev = 0;

		System.out.print(num + " is ");

		for (int i = num; i != 0; i /= 10) {
		
			rev *= 10;
			rev = rev + i%10;
		}
		if (num == rev)
			System.out.println("a palindrome number.");
		else
			System.out.println("not a palindrome number.");
	}
}
