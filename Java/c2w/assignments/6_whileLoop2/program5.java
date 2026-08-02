class program5{
	public static void main(String[] args){
		int num=216985;
		while(num>0){
			int x=num%10;
			num/=10;
			if(x%2==0){
				System.out.print(x*x*x+" ");
			}
		}
		System.out.println();
	}
}
