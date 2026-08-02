class program1 {
	public static void main(String args[]) {
		int num=2569185;
		
		int digit=0;

		while(num!=0) {
			digit=num%10;

			if(digit%2==0) {
				System.out.println(digit +" ");
			}
			
			num=num/10;
		}
	}
}

