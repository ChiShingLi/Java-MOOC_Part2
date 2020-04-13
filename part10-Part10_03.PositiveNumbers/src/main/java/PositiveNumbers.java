
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-8);
        numbers.add(-11);
        numbers.add(-3);
        numbers.add(1);
        numbers.add(8);
        numbers.add(1);
        System.out.println(numbers);
        System.out.println(positive(numbers));

    }

    //receives an ArrayList of integers, and returns the positive integers from the list using stream
    public static List<String> positive(List<Integer> numbers) {
        List<String> result = numbers.stream()
                .filter(s -> (s > 0)) //filter positive nums
                .map(s -> String.valueOf(s)) //convert int to String and return a stream of Strings
                .collect(Collectors.toList()); //convert to list
        //.collect(Collectors.toCollection(ArrayList::new));

        return result;
    }

}
