package Methods;

import java.util.Scanner;
public class TopNumber {
    public static void main(String[] args) {
        //Find all top numbers in the range [1 … n] and print them
//A top number holds the following properties:
//•	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
//•	Holds at least one odd digit, e.g. 232, 707, 87578.
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <= n; number++) {
            //проверка дали е top число
            //1. сумата от цифрите да се дели на 8 - ok
            //2. съдържа поне една нечетна цифра - ок
            if (isSumDivisibleBy8(number) && isContainingOddDigit(number)) {
                System.out.println(number);
            }
        }
    }
    //метод, който проверява дали сумата от цифрите се дели на 8
    //true -> ако сумата се дели на 8
    //false -> ако сумата не се дели на 8
    public static boolean isSumDivisibleBy8(int number) {
        int numberSum = 0;
        while (number > 0) {
            //взимам последната цифра
            int lastDigit = number % 10;
            //сумирам последната цифра
            numberSum += lastDigit;
            //премахвам последната цифра
            number = number / 10;
        }
        //2. проверка на сумата за деление с 8
        return numberSum % 8 == 0;
    }
    //метод, който проверява дали имаме поне една нечетна цифра в числото
    //true -> имам поне една нечетна цифра
    //false -> ако нямам нито 1 нечетна цифра
        public static boolean isContainingOddDigit(int number){
            //обходя всяка цифра в число -> проверка дали е нечетна
            while (number > 0) {
                //взимам последната цифра
                int lastDigit = number % 10;
                //проверявам дали е нечетна
                if (lastDigit % 2 != 0) {
                    return true;
                } else {
                    //цифрата да е четна -> премахвам
                    number = number / 10;
                }
            }
                //взели всички цифри и никоя не е била нечетна
                return false;
            }
        }
