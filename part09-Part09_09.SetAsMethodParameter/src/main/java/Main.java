
import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");

        for (String element : set) {
            System.out.println(element);
        }
    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    public static int returnSize(Set setObj) {
        return setObj.size();
    }

}
