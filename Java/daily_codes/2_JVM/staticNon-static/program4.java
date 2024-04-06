class program4 {
        void fun() {
        System.out.println("In asach function");
}
static void run() {
        System.out.println("In run function");
}
        public static void main(String args[]) {
                System.out.println("In main function");
                program4 obj=new program4();
		run();
		obj.fun();
        }
}
