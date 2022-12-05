package Lab;

import java.util.Scanner;

public class Lunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tvShow = scanner.nextLine();
        int EpDuration = Integer.parseInt(scanner.nextLine());
        int BreakDuration = Integer.parseInt(scanner.nextLine());
        double Lunch = BreakDuration / 8.0;
//Времето за обяд ще бъде 1/8 от времето за почивка,
        double Relax = BreakDuration / 4.0;
// а времето за отдих ще бъде 1/4 от времето за почивка.
        double TimeLeft = BreakDuration - Relax - Lunch;
        double diff = Math.abs(TimeLeft-EpDuration);
        //•	Ако времето е достатъчно да изгледате епизода:
        if (TimeLeft >= EpDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",tvShow,Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s,you need %.0f more minutes.",tvShow, Math.ceil(diff));
        }
    }
}
