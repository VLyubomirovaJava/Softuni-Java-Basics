package DataTypesVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//You will receive a number representing the starting yield of the source
int startingYield =Integer.parseInt(scanner.nextLine());
//   //повтаряме всеки ден -> добив = yield - 26; намалям силата на полето с 10
//        //стоп: бр. подправки в полето < 100
//        //продължаваме: бр. подправки в полето >= 100
int days =0;
int totalSpices =0;

while(startingYield>=100){

    int spices =startingYield-26; //kolko dobivat workforce
    totalSpices +=spices;
    days++;
    startingYield =startingYield -10;
}
        System.out.println(days);
if (totalSpices>=26){
    totalSpices-=26;
}
        System.out.println(totalSpices);
}
    }