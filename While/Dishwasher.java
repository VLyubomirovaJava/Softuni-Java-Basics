package While;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preparat = Integer.parseInt(scanner.nextLine());
        int kolichestvoPreparat = preparat * 750;
        int dishLoad = 0;
        int chinii=0;
        int tendzheri =0;
        while (kolichestvoPreparat>= 0) {
            String text = scanner.nextLine();
            if (text.equals("End")) {
                break;
            }

            int items = Integer.parseInt(text);
            dishLoad++;

            if (dishLoad % 3 == 0) {
                int neededDetergent = items * 15;
                kolichestvoPreparat = kolichestvoPreparat - neededDetergent;

                if (kolichestvoPreparat >= 0) {
                    tendzheri +=  items;
                }

            } else {
                int neededDetergent = items * 5;
                kolichestvoPreparat = kolichestvoPreparat - neededDetergent;


                if (kolichestvoPreparat >= 0) {
                    chinii += items;
                }
            }
        }
        if (kolichestvoPreparat>=0){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n",chinii,tendzheri);
            System.out.printf("Leftover detergent %d ml.",kolichestvoPreparat);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!",-kolichestvoPreparat);
        }
    }
}