package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        // Създават се три променливи: counter, max и element.
        // Променливата counter се инициализира с 1, а не с 0, защото, към един вече съществуващ елемент се прибавят еднаквите му,
        // а max ще пази най-дългата поредица от повтарящи се елементи.
        int counter = 1;
        int max = 0;
        // Променливата element ще покаже кой точно елемент се повтаря
        int element = 0;
////Използваме for цикъл, приключващ до дължината на масива – 1,
// тъй като индексът на последния елемент е дължината на масива – 1 (защото позициите се броят от 0).
// Променливата counter се увеличава, щом срещне два или повече еднакви елемента
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                counter++;
                if (counter > max) {
                    max = counter;
                    element = numbers[i];
                }
            }else
                    counter = 1;
                }

                for (int i = 0; i < max; i++) {
                    System.out.print(element + " ");
                }
            }
        }
















