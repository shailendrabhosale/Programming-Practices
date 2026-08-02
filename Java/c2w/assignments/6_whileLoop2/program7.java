class program7{
	public static void main(String[] args){
		int num=256985;
		int sum=0;
		while(num>0){
			int x=num%10;
			num/=10;
			if(x%2==0){
				sum+=x;
			}
		}
		System.out.println("Sum of even digits:"+sum);
	}
}
