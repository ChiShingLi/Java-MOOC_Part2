/*
Write a program that reads user input. When the user gives a negative number as an input, 
the input reading will be stopped. 
After this,
print all the numbers the user has given as input that are between 1 and 5.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList();

        while (true) {
            //convert String to integer
            int input = Integer.valueOf(scanner.nextLine());

            // stop if input is negative number
            if (input < 0) {
                break;
            }

            numList.add(input);
        }
        //print all the numbers that are between 1-5 using stream
        numList.stream()
                .filter(x -> (x <= 5)) //filter & get all the value between 1-5
                .forEach(x -> { //print each values
                    System.out.println(x);
                });
    }
}
