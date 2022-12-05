package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        switch (product) {
            case "coffee":
                getTotalPrice(quantity, 1.5);
                break;
            case "water":
                getTotalPrice(quantity, 1.0);
                break;
            case "coke":
                getTotalPrice(quantity, 1.4);
                break;
            case "snacks":
                getTotalPrice(quantity, 2.0);
                break;
        }
    }
    public static void getTotalPrice(int quantity,double price){
    double totalAmount =quantity*price;
        System.out.printf("%.2f",totalAmount);
    }
}

