class demo4 {

	public static void main(String[] args) {
	
		byte percentage = 75;

		if(percentage>85) {
		
			System.out.println("Medical.");
		}
		else if(percentage<=85 && percentage>75) {
		
			System.out.println("Engineering.");
		}
		else if(percentage<=75 && percentage>=65) {
		
			System.out.println("Pharmacy or Bachelor of Science.");
		}
		else {
		
			System.out.println("Your carrier, your choice!!!");
		}
	}
}
