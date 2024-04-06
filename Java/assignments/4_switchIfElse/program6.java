class program6 {
        public static void main(String args[]) {
                int num=7;
                System.out.println("Before Switch");

                if(num<5) {
		switch(num) {
                        case 1:
                                System.out.println("One");
                                break;
                         case 2:
                                System.out.println("Two");
                                break;
                         case 3:
                                System.out.println("Three");
                                break;
                         case 4:
                                System.out.println("Four");
                                break;
                         case 5:
                                System.out.println("Five");
                                break;
		}
	}
	else {
		System.out.println("Entered Number Is Greater Than 5");
	}
	}
}
