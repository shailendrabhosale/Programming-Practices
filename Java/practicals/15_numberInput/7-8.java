import java.io.*;

class Demo78 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter any number: ");
		int num = Integer.parseInt(br.readLine());

		System.out.print("Reverse of " + num + " is ");

		for (int i = num; i != 0; i /= 10) {
		
			System.out.print(i%10);
		}
		System.out.println(".");
	}
}
