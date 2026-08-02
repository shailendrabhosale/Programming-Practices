/* 4 3 2 1
 * 4 3 2 1
 * 4 3 2 1
 * 4 3 2 1 */

class program13 {
	public static void main(String args[]) {

		for(int i=1;i<4;i++) {
			int num=4;
			for(int j=1;j<=4;j++) {
				System.out.print(num-- +" ");
			}
			System.out.println();
		}
	}
}
			
