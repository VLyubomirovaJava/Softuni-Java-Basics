package While;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String WantedBook = scanner.nextLine();
        String command = scanner.nextLine();
        boolean isFound = false;
        int CountBooks = 0;

        while (!command.equals("No More Books")) {
            if (command.equals(WantedBook)) {
                isFound = true;
                break;
            }
            CountBooks++;
            command = scanner.nextLine();
        }
        if (isFound) {
                System.out.printf("You checked %d books and found it.", CountBooks);
            } else {
                System.out.printf("The book you search is not here!%nYou checked %d books.",CountBooks);
            }
        }
    }

