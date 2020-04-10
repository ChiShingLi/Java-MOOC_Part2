
import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {

        //this works since ArrayList is a implements from List
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List<String> listObj) {
        return listObj.size();
    }

}
