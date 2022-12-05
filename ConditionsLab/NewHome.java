package ConditionsLab;

import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String TypeOfFlowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        switch (TypeOfFlowers) {
            case "Roses":
                    price = 5 * flowersCount;
                    if (flowersCount>80){
                        price = price - (price *0.10);
                    }
                    break;
                    case "Dahlias":
                        price = 3.80 * flowersCount;
                        if (flowersCount>90){
                            price = price - (price *0.15);
                        }
                        break;
                    case "Tulips":
                        price = 2.80 *flowersCount;
                        if (flowersCount>80){
                            price = price - (price *0.15);
                        }
                        break;
                    case "Narcissus":
                        price = 3 * flowersCount;
                        if (flowersCount<120){
                            price = price + (price *0.15);
                        }
                        break;
                    case "Gladiolus":
                        price = 2.50 * flowersCount;
                        if (flowersCount<80){
                            price = price + (price *0.20);
                        }
                        break;
                }
        double MoneyLeft =Math.abs( budget - price);
                if (budget>=price){
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowersCount,TypeOfFlowers,MoneyLeft);
                } else if (price>budget){
                    System.out.printf("Not enough money, you need %.2f leva more.",MoneyLeft);
                }
    }}