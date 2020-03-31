/*
Write a number that asks user for input until the user inputs 0.

After this, the program prints the average of the positive numbers (numbers that are greater than zero).

If no positive number is inputted, the program prints "Cannot calculate the average"

Below a few examples of the program's output
 */
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        while (true) {
            //get for user input
            int input = Integer.valueOf(scanner.nextLine());

            //if user input 0, stop the program
            if (input == 0) {
                break;
            }

            //only work on positive numbers, excluding 0
            if (input > 0) {
                //add up all the user inputs
                sum += input;
                count++;
            }
        }
        if (sum > 0) {
            System.out.println((sum / count));
        } else {
            System.out.println("Cannot calculaate the average");
        }

    }
}
