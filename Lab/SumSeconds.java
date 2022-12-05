package Lab;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FirstTime = Integer.parseInt(scanner.nextLine());
        int SecondTime = Integer.parseInt(scanner.nextLine());
        int ThirdTime = Integer.parseInt(scanner.nextLine());
        int TotalTime = FirstTime + SecondTime + ThirdTime;
        int TotalMinutes = TotalTime / 60;
        int TotalSec = TotalTime % 60;
        if (TotalSec < 10) {
            System.out.printf("%d:%02d", TotalMinutes, TotalSec);
    } else {
            System.out.printf("%d:%d", TotalMinutes, TotalSec);

        }
      }
}
