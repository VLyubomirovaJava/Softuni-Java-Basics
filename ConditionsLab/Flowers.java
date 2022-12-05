package ConditionsLab;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Hrizantemi = Integer.parseInt(scanner.nextLine());
        int Rozi = Integer.parseInt(scanner.nextLine());
        int Laleta = Integer.parseInt(scanner.nextLine());
        String Season = scanner.nextLine();
        String Holiday = scanner.nextLine();
        double HrizantemiCena = 0;
        double RoziCena = 0;
        double LaletaCena = 0;
        int totalFlowers = Rozi + Laleta + Hrizantemi;
        switch (Season) {
            case "Spring":
            case "Summer":
                HrizantemiCena = 2;
                RoziCena = 4.10;
                LaletaCena = 2.50;
                break;
            case "Autumn":
            case "Winter":
                HrizantemiCena = 3.75;
                RoziCena = 4.50;
                LaletaCena = 4.15;
                break;
        }
        double bouquet = (Hrizantemi * HrizantemiCena) + (Rozi * RoziCena) + (LaletaCena * Laleta);
if (Holiday.equals("Y")){
    bouquet = bouquet + (bouquet*0.15);
}
        if (Season.equals("Spring") && Laleta > 7) {
            bouquet = bouquet - (bouquet * 0.05);
        }
        if (Season.equals("Winter") && Rozi >= 10) {
            bouquet = bouquet - (bouquet * 0.10);
        }
        if (totalFlowers > 20) {
            bouquet = bouquet - (bouquet * 0.20);
        }
        double total = bouquet + 2;
        System.out.printf("%.2f", total);
    }
}
