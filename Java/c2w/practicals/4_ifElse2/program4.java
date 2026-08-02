class program4 {
	public static void main(String args[]) {
		double percentage=20;

		if(percentage>=65.00 && percentage<=75.00) {
			System.out.println("Farmacy or bachler of science");
		}
		else if(percentage>75.00 && percentage<=85.00) {
			System.out.println("Engineering");
		}
		else if(percentage>85.00) {
			System.out.println("Medical");
		}
		else {
			System.out.println("Fail");
		}
	}
}
