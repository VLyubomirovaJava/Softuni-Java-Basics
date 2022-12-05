package AdditionalConditions;

import java.util.Scanner;

public class Rekolta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int LozeMetri = Integer.parseInt(scanner.nextLine());
        double GrozdeMeter = Double.parseDouble(scanner.nextLine());
        int NeededLitres = Integer.parseInt(scanner.nextLine());
        int Workers = Integer.parseInt(scanner.nextLine());
        double GrozdeObshto = LozeMetri * GrozdeMeter;
//се заделя 40% от реколтата за производство на вино.
        double Vino = 0.4 * GrozdeObshto / 2.5;
        if (Vino >= NeededLitres) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(Vino));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(Vino - NeededLitres), Math.ceil((Vino - NeededLitres) / Workers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(NeededLitres - Vino));
        }
    }
}

