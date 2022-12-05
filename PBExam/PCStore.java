package PBExam;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ProcessorInDollars = Double.parseDouble(scanner.nextLine());
        double CardInDollars = Double.parseDouble(scanner.nextLine());
        double RAMInDollars = Double.parseDouble(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double ProcessorInBGN = ProcessorInDollars * 1.57;
        double CardInBGN = CardInDollars * 1.57;
        double RaminBGN = RAMInDollars * 1.57;
        double RamTotal = RaminBGN * countRAM;
        double discountProcessor = ProcessorInBGN -(ProcessorInBGN* discount);
        double discountCard = CardInBGN -(CardInBGN* discount);

double total = discountCard + discountProcessor + RamTotal;
        System.out.printf("Money needed - %.2f leva.",total);    }
}