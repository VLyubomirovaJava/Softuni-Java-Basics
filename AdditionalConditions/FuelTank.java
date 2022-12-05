package AdditionalConditions;

import java.util.Locale;
import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Fuel = (scanner.nextLine());
        double litres = Double.parseDouble(scanner.nextLine());
        boolean isValidFuel =
                Fuel.equals("Diesel") ||
                        Fuel.equals("Gasoline") ||
                        Fuel.equals("Gas");
        if (!isValidFuel) {
            System.out.println("Invalid fuel!");
        } else if (litres >= 25 && isValidFuel) {
            System.out.printf("You have enough %s.", Fuel.toLowerCase());
        } else if (litres < 25 & isValidFuel) {
            System.out.printf("Fill your tank with %s!", Fuel.toLowerCase());
        }

    }
}


