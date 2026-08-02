/* Number of rows = 4
 *
 * d c b a
 * d c b a
 * d c b a
 * d c b a
 *
 *
 * Number of rows = 3
 *
 * c b a
 * c b a
 * c b a           */

class program8 {
        public static void main(String args[]) {
                int row=3;
             
                //char ch=0;

                for(int i=1;i<=row;i++) {
			int ch=row+96;

                        for(int j=1;j<=row;j++) {
                                System.out.print((char)ch--  +" ");

                        }

                        System.out.println();

                }
        }
}
