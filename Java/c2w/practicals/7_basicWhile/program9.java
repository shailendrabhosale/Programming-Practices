class program9 {
        public static void main(String args[]) {
                int i=150;
                int sum=0;

                while(i>=101) {

			if(i%2==1) {
				sum=sum+i;
			}

                        i--;
                }
                System.out.println(sum);
        }
}
