class program7{
	void fun(){
		System.out.println("In fun function");
	}
	static void run(){
		System.out.println("In run function");
	}
	public static void main(String[] args){
		System.out.println("In main function");
		run();
		program7 obj=new program7();
		obj.fun();
	}
}

