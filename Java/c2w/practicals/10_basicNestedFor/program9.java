/* 1 2 3 4
 * 4 5 6 7
 * 7 8 9 10
 * 10 11 12 13  */





class program9 {
        public static void main(String args[]) {
                int row=4;
                int num=1;
               

                for(int i=1;i<=row;i++) {


                        for(int j=1;j<=row;j++) {
                                System.out.print(num++  +" ");
			}
			
			num--;
                        System.out.println();

                }
        }
}
