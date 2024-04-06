/* 1A 2B 3C
 * 1A 2B 3C 
 * 1A 2B 3C */




class program7 {
        public static void main(String args[]) {
                int row=3;

                for(int i=1;i<=row;i++) {
			int num=1;
			char ch='A';

                        for(int j=1;j<=row;j++) {
                                System.out.print(""+num++ + ch++  +" ");

                        }

                        System.out.println();

                }
        }
}
