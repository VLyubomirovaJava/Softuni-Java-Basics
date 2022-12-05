package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        System.out.printf("Length: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.printf("Width: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double volume = (length * width * height)/3;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}

