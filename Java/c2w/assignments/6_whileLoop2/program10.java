class program10{
	public static void main(String[] args){
		int num=9367924;
		int sum=0;
		int y=1;
		while(num>0){
			int x=num%10;
			num/=10;
			if(x%2==1){
				sum+=x;
			}else{
				y*=x;
			}
		}
		System.out.println("Sum of odd digits:"+sum);
		System.out.println("Product of even digits:"+y);
	}
}
