class ArrBasics {
    public static void main(String[] args) {
        
        int[] squareNumbers = new int[10];

        System.out.println("Numbers row:");

        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            int square = (i + 1) * (i + 1);
            squareNumbers[i] = square;
        }

        System.out.println("Sqared numbers:");

        for(int i = 0; i < 10; i++) {
            System.out.print(squareNumbers[i]);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("Length of the array: " + squareNumbers.length);
        System.out.println("Last pointer of the array: " + squareNumbers[9]);
    }
}