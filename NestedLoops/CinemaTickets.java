package NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        int CountTotalTickets = 0;
        int countStandard = 0;
        int countKids = 0;
        int countStudent = 0;
        while (!command.equals("Finish")) {
            String movie = command;
            int seats = Integer.parseInt(scanner.nextLine());
            int CountCurrentTickets = 0;
            String ticketType = scanner.nextLine();

            while (!ticketType.equals("End")) {
                CountCurrentTickets++;
                CountTotalTickets++;
                if (ticketType.equals("student")) {
                    countStudent++;
                } else if (ticketType.equals("kid")) {
                    countKids++;
                } else if (ticketType.equals("standard")) {
                    countStandard++;
                }
                if (CountCurrentTickets >= seats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, CountCurrentTickets * 1.0 / seats * 100);
            command = scanner.nextLine();
        }
            System.out.println("Total tickets: "+ CountTotalTickets);
            System.out.printf("%.2f%% student tickets.%n", countStudent * 1.0 / CountTotalTickets * 100);
            System.out.printf("%.2f%% standard tickets.%n", countStandard * 1.0 / CountTotalTickets * 100);
            System.out.printf("%.2f%% kids tickets.%n", countKids * 1.0 / CountTotalTickets * 100);
        }
    }

