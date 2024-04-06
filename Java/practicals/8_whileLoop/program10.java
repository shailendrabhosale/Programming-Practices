class program10{
	public static void main(String[] args){
		long num=9307922405l;
		long sum=0;
		while(num>0){
			long x=num%10;
			sum=sum+x;
			num=num/10;
		}
		System.out.println(sum);
	}
}
