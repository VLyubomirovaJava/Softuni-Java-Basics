import java.util.Scanner;

public class PO7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int time = 3;
        int projects = Integer.parseInt(scanner.nextLine());
        int sum = projects * time;
        System.out.println("The architect " + name + " will need " + sum + " hours to complete " + projects + " project/s.");

    }}