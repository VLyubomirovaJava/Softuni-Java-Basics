package DataTypesVariables;

import java.util.Scanner;

public class SnowBalls11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snowballsCount = Integer.parseInt(scanner.nextLine());
//For each snowball, you will receive 3 input lines:
//•	On the first line, you will get the snowballSnow – an integer.
//•	On the second line, you will get the snowballTime – an integer.
//•	On the third line, you will get the snowballQuality – an integer.
        double maxValue = Double.MIN_VALUE;
        int snowballSnowBiggest = 0;
        int snowballTimeBiggest = 0;
        int snowballQualityBiggest = 0;

        for (int eachSnowball = 1; eachSnowball <= snowballsCount; eachSnowball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                snowballSnowBiggest = snowballSnow;
                snowballQualityBiggest = snowballQuality;
                snowballTimeBiggest= snowballTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowBiggest, snowballTimeBiggest, maxValue, snowballQualityBiggest);

    }
}

