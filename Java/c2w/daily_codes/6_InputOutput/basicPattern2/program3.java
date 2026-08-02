// 1 4 3 16 5 36 7 64 9

class program3 {
	public static void main(String args[]) {
		int num=1;

		for(int i=1;i<=9;i++) {
			if(i%2==1) {
				System.out.print(num + " ");
			}
			else {
				System.out.print(num*num + " ");
			}
			num++;
		}
	}
}

