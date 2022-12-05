package DataTypesVariables;

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//You will be given a single integer. Your task is to find the sum of its digits.
int number =Integer.parseInt(scanner.nextLine());
int sum =0;
 while (number>0){
     int currentNum = number % 10; //namirame posledna cifra
     sum +=currentNum;
     number =number /10; //premahvame posledna cifra
 }
        System.out.println(sum);
        }

        }