package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//povtarqshto deistvie -> vuvejdane na komandi
// stop: vhodni danni == end
// produljavame: vhodni danni!=end
String command = scanner.nextLine();
while(!command.equals("end")) {
//imame validna komanda za izpulnenie
//•	"swap {index1} {index2}" takes two elements and swap their places.
//•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
//•	"decrease" decreases all elements in the array with 1.

    if (command.contains("swap")){
        //1. vzimame elementa ot purviq indexi go parsvame ot string kum cqlo chislo
        int index1=  Integer.parseInt(command.split(" ")[1]);
        int index2 = Integer.parseInt(command.split(" ")[2]);
        int element1 = numbers[index1];
        //2. vzimame elementa ot vtoriq index
        int element2 = numbers[index2];

        //3. razmqna
        numbers[index1]=element2;
        numbers[index2]=element1;

}else if(command.contains("multiply")){
    //multiply
        //1.vzimame elementite ot purvi i vtori zadaden index
        int index1=  Integer.parseInt(command.split(" ")[1]);
        int index2 = Integer.parseInt(command.split(" ")[2]);
        int element1 = numbers[index1];
        int element2 = numbers[index2];
        int product =element1 * element2;
        numbers[index1]=product;

        } else if (command.equals("decrease")) {
            //decrease
        //1.obhodim vs elementi-> -1
        //2.pozicii/indeksi -\> 0 do posledniq (duljinata na masiva -1)
        for (int index = 0; index <= numbers.length-1 ; index++) {
            numbers[index]--; //namira tekushta indeks i go namalqva s 1
        }
        }
        command=scanner.nextLine();
}
//otpechatvame sus ; i interval
        for (int index = 0; index <= numbers.length-1 ; index++) {
            int currentNumber =numbers[index];
            //1. ako ne sme na poslednoto chislo
            if (index!=numbers.length-1){
            System.out.print(currentNumber + ", ");
        } else {
                System.out.print(currentNumber);
                //poslednoto chislo
            }

                }
            }
    }
