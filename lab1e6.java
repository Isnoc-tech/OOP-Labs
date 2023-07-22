public class ShapePrint {

    public static void main(String[] args) {
        int size = 5; // Change this value to adjust the size of the shapes
        printShapes(size);
    }

    public static void printShapes(int size) {
        // Printing the shapes side by side
        for (int i = 1; i <= size; i++) {
            // Align Center the stars
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print triangle stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Print some space between the shapes
            System.out.print("    ");

            // Print square stars
            for (int l = 1; l <= size; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
