/* 1 1 1 1 
 * 2 2 2 2
 * 4 4 4 4
 * 7 7 7 7 */



class program3 {
        public static void main(String args[]) {
                int row=4;
		int num=1;

                for(int i=1;i<=row;i++) {

                        
                        for(int j=1;j<=row;j++) {
                                System.out.print(num +" ");

                        }

                        System.out.println();
			//num++;
			num=num+i;


                }
        }
}
