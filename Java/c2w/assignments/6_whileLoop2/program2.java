class program2{
	public static void main(String[] args){
		int num=2569185;
		while(num>0){
			int x=num%10;
			num/=10;
			if(x%3!=0){
				System.out.print(x+" ");
			}
		}
		System.out.println();
	}
}
