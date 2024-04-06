class program9{
	void methodFun(){
		System.out.println("In fun function");
	}
	void methodGun(){
		System.out.println("In gun function");
	}
	void methodRun(){
		System.out.println("In run function");
	}
	public static void main(String[] args){
		System.out.println("In main function");
		program9 obj=new program9();
		obj.methodFun();
		obj.methodGun();
		obj.methodRun();
	}
}

