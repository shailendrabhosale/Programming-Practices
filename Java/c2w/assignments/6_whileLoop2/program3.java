class program3{
	public static void main(String[] args){
		int num=436780521;
		while(num>0){
			int x=num%10;
			num/=10;
			if((x!=0) && (x%2==0 || x%3==0)){
				System.out.print(x+" ");
			}
		}
		System.out.println();
	}
}
