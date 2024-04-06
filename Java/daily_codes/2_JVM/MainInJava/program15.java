class program15{
		int x=30;
		static int y=40;
		void fun(){
			System.out.println("In fun function");
		}
		static void run(){
			System.out.println("In run function");
		}
		public static void main(String[] args){
			program15 obj=new program15();
			System.out.println(x);
			System.out.println(obj.y);
			fun();
			obj.run();
		}
}

