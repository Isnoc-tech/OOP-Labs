public class TrianglePrint {

    public static void main(String[] args) {
        int size = 5; // Change this value to adjust the size of the triangle
        printTriangle(size);
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            // Align Center the stars
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // Print stars for each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
