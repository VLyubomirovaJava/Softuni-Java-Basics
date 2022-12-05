package ForLoopLab;

import java.util.Scanner;

public class Trekking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int Musala = 0;
        int MontBlant = 0;
        int Kilimanjaro = 0;
        int K2 = 0;
        int Everest = 0;
        int AllPeople = 0;
        for (int i = 1; i <= n; i++) {
            int PeopleCount = Integer.parseInt(scanner.nextLine());
            AllPeople=AllPeople+PeopleCount;
            if (PeopleCount <= 5) {
                Musala=Musala+PeopleCount;
            } else if (PeopleCount>=6 && PeopleCount <= 12) {
                MontBlant=MontBlant+PeopleCount;
            } else if (PeopleCount>=13 && PeopleCount <= 25) {
                Kilimanjaro=Kilimanjaro+PeopleCount;
            } else if (PeopleCount>=26 &&PeopleCount <= 40) {
                K2 = K2+PeopleCount;
            } else if (PeopleCount >= 41) {
                Everest = Everest + PeopleCount;
            }
        }
        System.out.printf("%.2f%%%n", Musala *1.0/ AllPeople * 100);
        // s *1.0 prevurnahme p1 v double
        System.out.printf("%.2f%%%n", MontBlant *1.0  / AllPeople * 100);
        System.out.printf("%.2f%%%n", Kilimanjaro *1.0 / AllPeople * 100);
        System.out.printf("%.2f%%%n", K2 *1.0 / AllPeople * 100);
        System.out.printf("%.2f%%%n", Everest * 1.0 / AllPeople * 100);
    }
}
