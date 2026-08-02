/* 1 2 3
 * 1 2 3
 * 1 2 3 */

class program11 {
	public static void main(String args[]) {
		for(int i=1;i<=3;i++) {
			int num=1;
			for(int j=1;j<=3;j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}
