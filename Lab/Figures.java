package Lab;

import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equals("square")) {
            double Dalzhina = Double.parseDouble(scanner.nextLine());
            double lice = Dalzhina * Dalzhina;
            System.out.printf("%.3f.%n", lice);
        } else if (figure.equals("rectangle")) {
            double strana1 = Double.parseDouble(scanner.nextLine());
            double strana2 = Double.parseDouble(scanner.nextLine());
            double S = strana1 * strana2;
            System.out.printf("%.3f.%n", S);
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * radius * radius;
            System.out.printf("%.3f.%n", area);
        } else if (figure.equals("triangle")) {
            double Dalzhina = Double.parseDouble(scanner.nextLine());
            double Visochina = Double.parseDouble(scanner.nextLine());
            double area = Dalzhina * Visochina / 2;
            System.out.printf("%.3f.%n", area);
        }
    }
}
