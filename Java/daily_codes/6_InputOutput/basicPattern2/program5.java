// 1 8 9 64 25 216

class program5 {
	public static void main(String args[]) {
		int num=1;
		for(int i=1;i<=6;i++) {
			if(i%2==1) {
				System.out.print(num*num +" ");
			}
			else {
				System.out.print(num*num*num +" ");
			}
			num++;
		}
	}
}
