package ForLoopLab;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//бройката числа, които ще четем от конзолата

        int max = Integer.MIN_VALUE;
//изчисляваме максималното число сред въведените

        int sum = 0;
//сумата от числата като променлива, която ще получи стойност в цикъла
        for (int i = 1; i <= n; i++) {
            // цикъл който чете числата от конзолата толкова пъти, колкото стойността на н позволява

            int number = Integer.parseInt(scanner.nextLine());
            //числото, което четем от конзолата при цикъла;
            sum += number;
            //добавяме го при всяко четене към сумата; sum=sum+number

            if (number > max) {
                // проверяваме дали това число е по-голямо от максималното . Ако да, това число става стойността на макс.
                max = number;
            }
        }
        int SumWithoutMax = sum - max;
        if (max == SumWithoutMax) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int diff = Math.abs(max - SumWithoutMax);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
