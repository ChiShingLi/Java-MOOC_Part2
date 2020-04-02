
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    // prints all the keys in the hashmap given as a parameter.
    public static void printKeys(HashMap<String, String> hashmap) {
        //using the .keySet() method, to loop thru all the keys in the hashmap
        for (String item : hashmap.keySet()) {
            System.out.println(item);
        }

    }

    // prints the keys in the hashmap given as a parameter, which contain the string given as a parameter.
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String item : hashmap.keySet()) {
            //print if the item contains certain strings
            if (item.contains(text)) {
                System.out.println(item);
            }
        }
    }

    // prints the values in the given hashmap whichs keys contain the given string.
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String item : hashmap.keySet()) {

            //if the item contains certain strings
            if (item.contains(text)) {
                //print out its value
                System.out.println(hashmap.get(item));
            }
        }

    }

}
