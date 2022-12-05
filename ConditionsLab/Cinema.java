package ConditionsLab;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String projection = scanner.nextLine();
int redove = Integer.parseInt(scanner.nextLine());
int koloni = Integer.parseInt(scanner.nextLine());
double income = 0.0;
if ("Premiere".equals(projection)){
income = redove * koloni *12;
    } else if ("Normal".equals(projection)){
income = redove * koloni * 7.50;
} else if ("Discount".equals(projection)){
    income = redove * koloni *5;
}
        System.out.printf("%.2f", income);

}
    }