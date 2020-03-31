
import java.util.Scanner;

/*
Write a program that reads strings from the user until the user inputs the string "end". 
As long as the input is not "end" the program should handle the input as an integer 
and print the cube of the integer (meaning number * number * number). 
Below are some sample outputs

 */
public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //read user inputs
            String input = scanner.nextLine();

            if (input.equals("end")) {
                //stop the program
                break;
            }

            //convert the input String into a integer & return the result
            int result = Integer.valueOf(input);
            System.out.println((result * result * result));
        }

    }
}
