class program12 {
        public static void main(String args[]) {
                int num=2;
                System.out.println("Before switch");

                switch(num) {
                        case 1:
                                System.out.println("One");
                        case 2:
                                System.out.println("Two");
                        case 3:
                                System.out.println("Three");
			default :
				System.out.println("In default state");
                }
                System.out.println("After switch");
        }
}
