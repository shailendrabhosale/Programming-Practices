class program8{
	public static void main(String[] args){
		int num=256985;
		int x=1;
		while(num>0){
			int y=num%10;
			num/=10;
			if(y%2==1){
				x*=y;
			}
		}
		System.out.println("Product of odd digits:"+x);
	}
}
