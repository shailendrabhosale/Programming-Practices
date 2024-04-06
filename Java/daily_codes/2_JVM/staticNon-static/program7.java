class program7 {
        void methodfun() {
                System.out.println("In asach function");
}
        void methodrun() {
                System.out.println("In run function");
}
        void methodgun() {
                System.out.println("In gun function");
        }
        public static void main(String args[]) {
                System.out.println("In main function");
                program7 obj=new program7();
                obj.methodrun();
                obj.methodgun();
                obj.methodfun();
        }
}
