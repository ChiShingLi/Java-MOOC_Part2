
import java.util.ArrayList;

// part3 
// class for keep track of changes in ProductWarehouse
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    // adds provided status as the latest amount to remember in the change history.
    public void add(double status) {
        history.add(status);
    }

    // empties the history.
    public void clear() {
        history.clear();
    }

    // returns the string representation of the change history. 
    @Override
    public String toString() {
        return history.toString();
    }

    //part 4
    // returns the largest value in the change history. 
    //If the history is empty, the method should return zero.
    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        //find the largest number
        //assume the largest # is the first # in the list
        double largestValue = history.get(0);

        //loop thru the list and find the largest number
        for (double num : history) {
            if (num > largestValue) {
                largestValue = num;
            }
        }
        return largestValue;
    }

    //returns the smallest value in the change history. 
    //If the history is empty, the method should return zero.
    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        //find the smallest number
        //assume the smallest # is the first # in the list
        double smallestValue = history.get(0);

        //loop thru the list and find the smallest number
        for (double num : history) {
            if (num < smallestValue) {
                smallestValue = num;
            }
        }
        return smallestValue;
    }

    //returns the average of the values in the change history. 
    //If the history is empty, the method should return zero.
    public double average() {
        double sum = 0;
        for (double item : history) {
            //add up all the nums
            sum += item;
        }
        return (sum / history.size());
    }
}
