
public class program10 {
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Vending Machine!");
        int choice=1;

        

        switch (choice) {
            case 1:
                System.out.println("You selected Coke. Please insert $1.");
                break;
            case 2:
                System.out.println("You selected Pepsi. Please insert $1.");
                break;
            case 3:
                System.out.println("You selected Snickers. Please insert $1.50.");
                break;
            case 4:
                System.out.println("You selected KitKat. Please insert $1.50.");
                break;
            case 5:
                System.out.println("You selected Water. Please insert $0.75.");
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
        }
    }
}

