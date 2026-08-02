class program7 {
	public static void main(String args[]) {
		int sellingprice=1000;
		int costprice=1000;

		int profit=sellingprice-costprice;

		if(profit>0) {

			System.out.println("Profit of "+profit);
		}
		else if(profit<0) {
			System.out.println("Loss of"+profit);
		}
		else {
			System.out.println("No profit no loss");
		}
	}
}
