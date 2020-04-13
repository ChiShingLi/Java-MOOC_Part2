/*
the program should print the average of all the positive numbers, 
or the average of all the negative numbers (n or p). 
If the user selects "n", the average of all the negative numbers is printed. 
Otherwise the average of all the positive numbers is printed.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numList = new ArrayList<>();

        while (true) {
            //get user input
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            // at the input to the num ArrayList
            numList.add(input);
        }
        //ask if the user want to print positive or negative number
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();

        if (input.equals("p")) {
            //get the average of selected numbers using stream()
            double result = numList.stream()
                    .mapToInt(s -> Integer.valueOf(s)) //convert all the string into integer in the list
                    .filter(s -> (s > 0)) //filter by positive numbers
                    .average() //get their average number
                    .getAsDouble(); //return as double

            System.out.println("Average of the positive numbers: " + result);
        } else {
            //get the average of selected numbers using stream()
            double result = numList.stream()
                    .mapToInt(s -> Integer.valueOf(s)) //convert all the string into integer in the list
                    .filter(s -> (s < 0)) //filter by negative numbers
                    .average() //get their average number
                    .getAsDouble(); //return as double

            System.out.println("Average of the negative numbers: " + result);
        }

    }
}
