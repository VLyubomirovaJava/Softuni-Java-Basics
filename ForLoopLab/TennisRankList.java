package ForLoopLab;

import java.util.Scanner;

public class TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tourneys = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int TourneyPoints = 0;
        int sum = 0;
        int   RankPoints = 0;
        double Wins = 0;
        for (int i = 1; i <= tourneys; i++) {
            String rank = scanner.nextLine();
        switch (rank) {
                case "W":
                    RankPoints = 2000;
                    TourneyPoints = TourneyPoints + RankPoints;
                    Wins++;
                    break;

                case "F":
                    RankPoints = 1200;
                    TourneyPoints = TourneyPoints + RankPoints;
                    break;

                case "SF":
                    RankPoints = 720;
                    TourneyPoints = TourneyPoints + RankPoints;
                    break;
            }

        }
        sum= TourneyPoints +initialPoints;
        double avg =Math.abs(TourneyPoints/tourneys);
        double percentsWins= (Wins / tourneys) * 100;
        System.out.printf("Final points: %d%n",sum);
        System.out.printf("Average points: %.0f%n",avg);
        System.out.printf("%.2f%%",percentsWins);

    }


}