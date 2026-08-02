class program5 {
        public static void main(String args[]) {
                int num=216985;
                int digit=0;

                while(num!=0) {
                        digit=num%10;


                                if(digit%2 == 0) {
                                        System.out.print(digit*digit*digit +" ");

                                }

                        num/=10;


                }
                System.out.println();
        }
}
