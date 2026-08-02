/* 1 2 3 4
 * 4 3 2 1
 * 1 2 3 4
 * 4 3 2 1 */

class program19 {
        public static void main(String args[]) {
                int num=1;
                for(int i=1;i<=4;i++) {

                        for(int j=1;j<=4;j++) {

                                if(i%2==1) {
                                        System.out.print(num++ +" ");  // num=num+1 , return temp.
                                }

                                else {
                                        System.out.print(--num +" ");      //num=num-1
                                } 
                        }

                        System.out.println();
                }
        }
}
