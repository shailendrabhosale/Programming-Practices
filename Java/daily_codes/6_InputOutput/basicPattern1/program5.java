/*A C E
 *G I K
  M O Q */




import java.util.*;
class program5 {
        public static void main(String args[]) {
                Scanner sc=new Scanner(System.in);
                        System.out.print("Enter no of rows : ");
                        int row = sc.nextInt();

                char ch='A';

                for(int i=1;i<=row;i++) {


                        for(int j=1;j<=row;j++) {
                                System.out.print(ch +" ");
				ch+=2;
                        }
			
                        System.out.println();
                        


                }
        }
}
