class program14{
		int x=30;
		static int y=40;
		void fun(){
			System.out.println("In fun function");
		}
		static void run(){
			System.out.println("In run function");
		}
		public static void main(String[] args){
			program14 obj=new program14();
			System.out.println(obj.x);
			System.out.println(obj.y);
			obj.fun();
			obj.run();
		}
}

