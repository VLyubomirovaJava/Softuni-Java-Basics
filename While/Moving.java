package While;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int shirochina = Integer.parseInt(scanner.nextLine());
int dalzhina = Integer.parseInt(scanner.nextLine());
int visochina = Integer.parseInt(scanner.nextLine());
String command = scanner.nextLine();
int space = shirochina*dalzhina*visochina;
int boxesSum = 0;
boolean NoMoreSpace =false;
while (!command.equals("Done")){
    int boxCurrent = Integer.parseInt(command);
    boxesSum =boxesSum + boxCurrent;
    if (space<boxesSum){
        NoMoreSpace =true;
        break;
    }
command=scanner.nextLine();}

        if (NoMoreSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.",boxesSum-space);
        } else {
            System.out.printf("%d Cubic meters left.", space-boxesSum);        }
    }
    }
