class program9{
	public static void main(String[] args){
		int num=214367689;
		int x=0;
		int y=0;
		while(num>0){
			int z=num%10;
			if(z%2==1){
				x++;
			}else{
				y++;
			}
			num=num/10;
		}
		System.out.println("Odd count:"+x);
		System.out.println("Even count:"+y);
	}
}
