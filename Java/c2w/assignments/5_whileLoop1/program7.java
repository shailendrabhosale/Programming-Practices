class program7 {
	public static void main(String args[]) {
		for(char ch=65;ch<91;++ch) {
			if(ch=='A' || ch=='O' || ch=='I' || ch=='E' || ch=='U') {
				continue;
			}
			System.out.println(ch);
		}
	}
}
