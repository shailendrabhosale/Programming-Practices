import java.io.*;

class Demo34 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter any number: ");
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 1; i <= num; i++) {
		
			if (num%i == 0)
				cnt++;
		}
		
		if (cnt>2)
			System.out.println(num + " is a composite number.");
		else
			System.out.println(num + " is not a composite number.");
	}
}
