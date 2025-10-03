import java.util.Scanner;

class TempArr {
    public static void main(String[] args) {           
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();

        System.out.print("Enter the array elements:");
        int[] Arr = new int[s];

        for(int i=0; i<s; i++){
            if(sc.hasNextInt()){
                Arr[i] = sc.nextInt();
            }
        }
        
        System.out.print("The array elements are: ");
        for(int i=0; i<s; i++){
            System.out.print(Arr[i] + " ");
        }
    }
}