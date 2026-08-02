class program19{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			char ch1='a';
			char ch2='A';
			for(int j=1;j<=4;j++){
				if(i%2==0){
					System.out.print(ch1++ +" ");
				}else{
					System.out.print(ch2++ +" ");
				}
			}
			System.out.println();
		}
	}
}
