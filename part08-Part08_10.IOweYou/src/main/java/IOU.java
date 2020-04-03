
import java.util.HashMap;

public class IOU {
//    private int amountOwed;
//    private String personOwed;

   private HashMap<String, Double> hashmap;

    public IOU() {
        hashmap = new HashMap<>();
    }

    //saves the amount owed and the person owed to to the IOU.
    public void setSum(String toWhom, double amount) {
        hashmap.put(toWhom, amount);
    }

    //returns the amount owed to the person whose name is given as a parameter. 
    //If the person cannot be found, it returns 0.
    public double howMuchDoIOweTo(String toWhom) {
        //return the amount if the key exists; else if not found, return 0
        return hashmap.getOrDefault(toWhom, 0.0);
    }

}
