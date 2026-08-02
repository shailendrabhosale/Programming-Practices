class program1{
	public static void main(String[] args){
		int data=800;

		if(data<500){
			switch(data){
				case 100:
					System.out.println("1 hundred");
				case 200:
					System.out.println("2 hundred");
				case 300:
					System.out.println("3 hundred");
				case 400:
					System.out.println("4 hundred");
			}
		}else{
			if(data>500){
				switch(data){
					case 600:
						System.out.println("6 hundred");
					case 700:
						System.out.println("7 hundred");
					case 800:
						System.out.println("8 hundred");
					case 900:
						System.out.println("9 hundred");
					case 1000:
						System.out.println("1 thousand");
				}
			}else{
				System.out.println("Coder :)");
			}
		}
	}
}
