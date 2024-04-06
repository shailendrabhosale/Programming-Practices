class program2 {
	public static void main(String args[]) {
		int num=2569185;
		int digit=0;

		while(num!=0) {
			digit=num%10;

			if(digit%3 != 0) {
				System.out.println(digit);
				
			}
			num/=10;
			
		}
	}
}
