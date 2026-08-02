class program4 {
        public static void main(String args[]) {
                int num=256985;
                int digit=0;

                while(num!=0) {
                        digit=num%10;
                       

                                if(digit%2 == 1) {
                                        System.out.print(digit*digit +" ");

                                }
                       
                        num/=10;


                }
                System.out.println();
        }
}
