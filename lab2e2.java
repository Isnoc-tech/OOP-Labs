import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("DitNo: ");
        String ditNo = myObj.nextLine();

        System.out.print("Name: ");
        String name = myObj.nextLine();

        System.out.print("District: ");
        String district = myObj.nextLine();

        System.out.println("DitNo: " + ditNo);
        System.out.println("Name: " + name);
        System.out.println("District: " + district);

    }
}
