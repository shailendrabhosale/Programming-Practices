class program9{
	public static void main(String[] args){
		int num=2469185;
		int sum=0;
		int y=0;
		while(num>0){
			int x=num%10;
			num/=10;
			if(x%2==1){
				y=x*x;
				sum+=y;
			}
		}
		System.out.println("Sum of squares of odd digits:"+sum);
	}
}
