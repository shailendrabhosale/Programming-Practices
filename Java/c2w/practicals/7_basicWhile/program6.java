/*class program6 {
        public static void main(String args[]) {
                char ch='A';

                while(ch>='A' && ch<='Z') {
                        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                               
                }
                else {
                        System.out.println(ch);
                }
                ch++;
        }
}
}
*/
class program6 {
	public static void main(String args[]) {
		int ch=65;

		while(ch<=90) {
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			}

			else {
				System.out.print((char)ch +" ");
			}
			ch++;
		}
	}
}
