package AdditionalConditions;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Magnolias = Integer.parseInt(scanner.nextLine());
        int Zyumbul = Integer.parseInt(scanner.nextLine());
        int Roses = Integer.parseInt(scanner.nextLine());
        int Cactuses = Integer.parseInt(scanner.nextLine());
        double GiftPrice = Double.parseDouble(scanner.nextLine());
        double MagnoliaPrice = (3.25 * Magnolias) ;
        double ZyumbulPrice = (4 * Zyumbul);
        double RosePrice = ( Roses * 3.50) ;
        double CactusPrice = ( Cactuses * 8) ;
        double Order = ( ZyumbulPrice + RosePrice + MagnoliaPrice + CactusPrice ) ;
        double tax = ( Order * 0.05 );
        double Winnings = (Order - tax );
        double left;
        if ( Winnings >= GiftPrice) {
            left = Winnings - GiftPrice;
            System.out.printf("She is left with %.0f leva. ", Math.floor(left));
        } else {
            left = GiftPrice - Winnings;
            System.out.printf("She will have to borrow %.0f leva. ", Math.ceil(left));
        }
    }
}
