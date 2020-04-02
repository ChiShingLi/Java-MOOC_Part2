
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    // prints all the values in the hashmap given as a parameter using the toString method of the Book objects.
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book item : hashmap.values()) {
            System.out.println(item);
        }
    }

    // prints only the Books in the given hashmap whichs name contains the given string.
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        //first, check each Book object value in the hashmap to see if it contains certain text
        for (Book item : hashmap.values()) {
            if (item.getName().contains(text)) {
                System.out.println(item);
            }
        }
    }

}
