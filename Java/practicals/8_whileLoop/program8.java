class program8{
	public static void main(String[] args){
		int num=216985;
		while(num>0){
			int x=num%10;
			if(x%2==1){
				System.out.println(x);
			}
			num=num/10;
		}
	}
}
