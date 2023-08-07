public class ToKilometerConvertor {

    public static void main(String[] args) {

        int miles, yards;
        double kilometers;

        miles = 26;
        yards = 385;

        double kilometersPerMile = 1.609;
        double yardsPerMile = 1760.0;
        double totalMiles = miles + (yards / yardsPerMile);
        kilometers = totalMiles * kilometersPerMile;

        System.out.println("The marathon distance in kilometers: " + kilometers);
    }
}
