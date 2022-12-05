package DataTypesVariables;

import java.util.Scanner;

public class Pokemon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustion = Integer.parseInt(scanner.nextLine());
        int targets = 0;
        int initialPower = power;
        //повтаряме:
        //1. power -= distance -> бр. poke++
        //2. проверка за умората
        //stop: power < distance
        //продължава: power >= distance
        while (power >= distance) {
            //отива до целта -> хаби енергия
            power -= distance;
            //стига -> poke-ване
            targets++;
            //проверка дали не е изморен

            if (power == initialPower / 2) {
                if (exhaustion != 0) {
                    power = power / exhaustion;
                }
            }
        }
        System.out.println(power);
        System.out.println(targets);
    }
}