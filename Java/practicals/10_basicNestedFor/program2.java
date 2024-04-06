/* 1 2 3
 * 1 2 3
 * 1 2 3 */

class program2 {
        public static void main(String args[]) {
                int row=4;

                for(int i=1;i<=row;i++) {

			int num=1;
                        for(int j=1;j<=row;j++) {
                                System.out.print(num++ +" ");
				
                        }

                        System.out.println();


                }
        }
}
