class program16 {
        public static void main(String args[]) {
                char data='B';
                System.out.println("Before switch");

                switch(data) {
                        case 'A':
                                System.out.println("One");
                                break;
                        case 'B':
                                System.out.println("Two");
                                break;
                        case 'C':
                                System.out.println("Three");
                                break;
                        default:
                                System.out.println("In default state");
                }
                System.out.println("After switch");
        }
}
