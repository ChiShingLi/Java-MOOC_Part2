/*
Write a program that reads the user's input as strings.
When the user inputs an empty string (only presses enter), 
the input reading will be stopped and the program will print all the user inputs.
using stream
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            //add the user input to the list
            inputList.add(input);
        }

        //for each input Strings in the stream print out each inputs
        inputList.stream()
                .forEach(x -> {
                    System.out.println(x);
                });
    }
}
