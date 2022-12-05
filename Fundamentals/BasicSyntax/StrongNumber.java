package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1.цяло число
// 2. проверка дали  е стронг
//3. ако е = йес
//4. ако не е = не

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber =number; //purvonachalna vuvedenata stoinost na chisloto

        int sumFact = 0; // suma ot faktorielite;
        while (number > 0) {
            int lastDigit = number % 10;
//namiram faktoriel na chisloto lastdigit
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            //sumiram faktoriel
            sumFact += fact;
            number = number / 10; //premahvame posledns cifra
        }
//proverka dali sumata ot faktorielite e ravna na number
if (sumFact==startNumber){
    System.out.println("yes");
}else {
    System.out.println("no");
}
    }
}