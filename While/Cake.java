package While;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dulzhina = Integer.parseInt(scanner.nextLine());
        int shirochina = Integer.parseInt(scanner.nextLine());
        int parcheta = dulzhina * shirochina;
        boolean NoMoreCake = false;
        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int take = Integer.parseInt((command));
            parcheta = parcheta - take;
            if (parcheta <= 0) {
                NoMoreCake =true;
                break;
            }
            command = scanner.nextLine();
        }
        if (NoMoreCake){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(parcheta));
        } else {
            System.out.printf("%d pieces are left.",parcheta);        }
    }
}