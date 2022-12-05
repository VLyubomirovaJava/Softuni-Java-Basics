package DataTypesVariables;

import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of p persons.

        int people = Integer.parseInt(scanner.nextLine());
        int capacityElevator = Integer.parseInt(scanner.nextLine());
        double courses = Math.ceil( people * 1.0/ capacityElevator);
        System.out.printf("%.0f",courses);    }
}
