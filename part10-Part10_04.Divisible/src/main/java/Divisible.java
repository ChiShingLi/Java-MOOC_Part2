
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        //print each numbers in the list
        divisible.stream()
                .forEach(num -> System.out.println(num));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> result;

        result = numbers.stream()
                //filter & get all the numbers that are divisible by 2, 3, or 5
                .filter(x -> {
                    if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toCollection(ArrayList::new)); //collect & return as integer ArrayList

        return result;
    }

}
