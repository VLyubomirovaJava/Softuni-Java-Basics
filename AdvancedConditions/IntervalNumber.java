package AdvancedConditions;

import java.util.Scanner;

public class IntervalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if(num >= -100 && num <= 100 && num != 0){
            // intervala ot -100 do 100 i ne e ravno na nula
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}