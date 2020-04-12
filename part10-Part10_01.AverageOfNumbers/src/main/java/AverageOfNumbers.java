/*
reads user input. If the user input is "end", 
the program stops reading input.
The rest of the input is numbers. 
When the user input is "end", the program prints the average of all of the numbers.
Implement calculating the average using a stream
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        ArrayList<String> wordList = new ArrayList<>();

        while (true) {
            //get user input as String
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            //else add the String in the ArrayLst
            wordList.add(input);
        }

        // calculate the average using stream
        double average = wordList.stream()
                .mapToInt(s -> Integer.valueOf(s)) //convert string to int
                .average() //calculate average
                .getAsDouble(); //return result as double

        System.out.println("average of the numbers: " + average);
    }

}
