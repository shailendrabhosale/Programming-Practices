// 9 B 7 D 5 F 3 H
class program9 {
	public static void main(String args[]) {
		int num=9;
		char ch='A';

		for(int i=1;i<=8;i++) {
			if(i%2==1) {
				System.out.print(num +" ");
			}
			else {
				System.out.print(ch +" ");
			}
			ch++;
			num--;
		}
	}
}

