
import java.util.HashMap;

/*
matthew's nickname is matt
michael's nickname is mix
arthur's nickname is artie
 */
public class Nicknames {

    public static void main(String[] args) {
        //create a name HashMap with the person's name and their nickname
        HashMap<String, String> name = new HashMap<>();
        name.put("matthew", "matt");
        name.put("michael", "mix");
        name.put("arthur", "artie");

        //get Matthew's nickname from the HashMap and print it
        System.out.println(name.get("matthew"));

    }

}
