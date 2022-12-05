import java.util.Scanner;

public class PO9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double AllSqM = Double.parseDouble(scanner.nextLine());
        double amount = AllSqM * 7.61;
        double discount = amount * 0.18;
        double FinalPrice = amount - discount;
        System.out.printf( "The final price is: % 2f lv.%n",FinalPrice);
        System.out.printf("The discount is: % 2f lv.",discount);

    }}