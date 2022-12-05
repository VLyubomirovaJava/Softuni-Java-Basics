import java.util.Scanner;

public class PO8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int DogFood = Integer.parseInt(scanner.nextLine());
        int CatFood = Integer.parseInt(scanner.nextLine());
        double CatFoodPrice = 4;
        double DogFoodPrice = 2.5;
        double TotalPrice =CatFoodPrice * CatFood + DogFoodPrice * DogFood;
        System.out.println(TotalPrice + " lv.");
    }}
