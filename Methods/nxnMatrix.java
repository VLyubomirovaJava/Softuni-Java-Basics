package Methods;

import java.util.Scanner;

public class nxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());



        printMattrix(n);
    }

    private static void  printMattrix(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}