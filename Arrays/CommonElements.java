package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//  //1. входни данни -> два текстови масива
//        //2. обхождаме всеки един елемент от втория масив
//            //повтарям: обхождам първия масив -> ел2 == ел1

        String[] firstArray = scanner.nextLine().split(" ");
        //"Hey hello 2 4".split(" ") -> ["Hey", "hello", "2", "4"]

        String[] secondArray = scanner.nextLine().split(" ");
        //"10 hey 4 hello".split(" ") -> ["10", "hey", "4", "hello"]
        //обхождане на масиви: for по index или foreach по елементи

        for (String elementSecondArr : secondArray) {
            //блок от код, който искаме да повторим за всеки един елемент
            for (String elementFirstArr : firstArray) {
                if (elementSecondArr.equals(elementFirstArr)) {
                    System.out.print(elementFirstArr + " ");
                    break;
                }
            }
        }
    }
}