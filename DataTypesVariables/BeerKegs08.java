package DataTypesVariables;

import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a program that calculates the volume of n beer kegs.
//You will receive in total 3 * n lines. Every three lines will hold information for a single keg.
//First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.
//Calculate the volume using the following formula: π * r^2 * h.
//In the end, print the model of the biggest keg.
        //broika kegove
        int n = Integer.parseInt(scanner.nextLine());

        String maxModelKeg = "";
        double maxVolume = Double.MIN_VALUE;
        for (int keg = 1; keg <= n; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            //обем на кега = π * r^2 * h
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxVolume) {
                maxVolume = volume;
                maxModelKeg = model;
            }
        }
        System.out.println(maxModelKeg);
    }
}