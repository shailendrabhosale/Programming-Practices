class program6{
	public static void main(String[] args){
		int num=234;
		int x=1;
		while(num>0){
			int y=num%10;
			num/=10;
			x*=y;
		}
		System.out.println(x);
	}
}
