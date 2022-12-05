package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

//2. крайна сума =
// слушалки(брой слушалки*headsetprice)
// + мищки(mouseprice*бройка) +
// клавиатури(keyboardprice*бройка)
// + монитори(displayprice*EKRANIBROIKA)
        int countHeadset = lostGames / 2; //broika slushalki
        int countMouse = lostGames / 3;
        int countKeyboard = lostGames / 6;
        int countDisplay = lostGames / 12;
        double finalSum = (countHeadset * headsetPrice)
                + (countMouse * mousePrice)
                + (countKeyboard * keyboardPrice)
                + (countDisplay * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", finalSum);
    }
}
