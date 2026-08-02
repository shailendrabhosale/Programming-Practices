class program7{
	public static void main(String[] args){
		int num=93079224;
		int count=0;
		while(num>0){
			int x=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}
}
