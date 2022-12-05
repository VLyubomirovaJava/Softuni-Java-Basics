package AdditionalConditions;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Pipes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volume = Integer.parseInt(scanner.nextLine());
// числото P1 – дебит на първата тръба за час
        int pipe1 = Integer.parseInt(scanner.nextLine());
// числото P2 – дебит на 2 тръба за час
        int pipe2 = Integer.parseInt(scanner.nextLine());
//H – часовете които работникът отсъства
        double hours = Double.parseDouble(scanner.nextLine());
        double pipe1Full = hours * pipe1;
        double pipe2Full = hours * pipe2;

        double totalPipes = pipe1Full + pipe2Full;
        double fullPool = (totalPipes / volume) * 100.0;
        double percent1 = (pipe1Full / totalPipes) * 100.0;
        double percent2 = (pipe2Full / totalPipes) * 100.0;
        double overWater = totalPipes - volume;
        if (totalPipes <= volume) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%% . Pipe 2: %.2f%% .", fullPool, percent1, percent2);
        } else {
            System.out.printf("For %s hours the pool overflows with %.2f liters", hours, overWater);
        }
    }
}