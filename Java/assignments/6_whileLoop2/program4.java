class program4{
	public static void main(String[] args){
		int num=256985;
		while(num>0){
			int x=num%10;
			num/=10;
			if(x%2==1){
				System.out.print(x*x+" ");
			}
		}
		System.out.println();
	}
}
