package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        double area = getRectangleArea(width, length);
            System.out.printf("%.0f%n", area);
        }



public static double getRectangleArea(double width, double length){
return width*length;
}
    }