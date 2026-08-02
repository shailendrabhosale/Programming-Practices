class program3 {
        public static void main(String args[]) {
                int num=436780521;
                int digit=0;

                while(num!=0) {
                        digit=num%10;
			if(digit!=0) {

                        	if(digit%2 == 0 || digit%3==0) {
                                	System.out.print(digit +" ");

                        	}
			}
                        num/=10;
			

                }
		System.out.println();
        }
}
