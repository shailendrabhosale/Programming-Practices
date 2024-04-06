class program8 {
        public static void main(String args[]) {
                int num1=4;
		int num2=6;
		int num3=0;

		if(num1>0 && num2>0) {
			num3=num1*num2;
			System.out.println(num3);
		}
		else {
			System.out.println("Sorry negative no is not allowed");
		}

		switch(num3 % 2) {
			case 0:
			 System.out.println("Number is even");
			 break;

			case 1:
                         System.out.println("Number is odd");
			 break;
		}
	}
}
