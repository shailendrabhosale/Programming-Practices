/* Number of rows = 4
 *
 * 1 2 3 4
 * 2 3 4 5
 * 3 4 5 6
 * 4 5 6 7
 *
 * Number of rows = 3
 *
 * 1 2 3
 * 2 3 4
 * 3 4 5        */


class program10 {
        public static void main(String args[]) {
                int row=3;
                int num=1;


                for(int i=1;i<=row;i++) {


                        for(int j=1;j<=row;j++) {
                                System.out.print(num++  +" ");
                        }

                        num=i+1;
                        System.out.println();

                }
        }
}
