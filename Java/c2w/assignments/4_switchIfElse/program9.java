class program9 {
        public static void main(String args[]) {
                int sub1=40;
                int sub2=60;
                int sub3=67;
		int sub4=98;
		int sub5=89;
		int totsub=0;
		int avg=0;

                if(sub1>35 && sub2>35 && sub3>35 && sub4>35 && sub5>35) {
                        totsub=sub1+sub2+sub3+sub4+sub5;
			avg=totsub/5;
                        System.out.println("Total percentage of student is : "+avg);
                }
                else {
                        System.out.println("You failed the exam");
                }

                switch (avg / 10) {
                case 9:
                    System.out.println("First class with distinction");
                    break;
                
                case 8:
                    System.out.println("First class");
                    break;
                case 7:
                    System.out.println("Second class");
                    break;
                default:
                    System.out.println("Pass");
            }
        }
}
