package AdditionalConditions;

import java.util.Scanner;

public class Transport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String when = scanner.nextLine();
        double taxiRate= 0.0;
        double initialTaxi = 0.70;
        double busFee = 0.09;// min 20km
        double trainFee = 0.06; // min 100
        double sum = 0.0;
        if (when.equals("day")) {
taxiRate= 0.79;
            } else if (when.equals("night")) {
                taxiRate= 0.90;
            }
                if (km <20) {
                    sum = initialTaxi + (taxiRate * km);
                } else if (km < 100) {
                    sum = (busFee * km);
                } else {
                    sum = (trainFee * km) ;
                }
        System.out.printf("%.2f",sum);

    }
    }

