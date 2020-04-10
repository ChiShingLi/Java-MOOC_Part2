// Part 2 Box

import java.util.ArrayList;

public class Box implements Packable {

    private double capacity;
    //take in a list of Packable objects
    private ArrayList<Packable> boxContents;

    public Box(double capacity) {
        this.boxContents = new ArrayList<>();
        this.capacity = capacity;
    }

    //implement .weight() method according to the Packable interface
    @Override
    public double weight() {
        double weight = 0;
        //calcalate the total weight of the box
        for (Packable item : boxContents) {
            weight += item.weight();
        }

        return weight;
    }

    public void add(Packable item) {
        //check if it exceed max capacity
        if ((capacity - item.weight() >= 0)) {
            boxContents.add(item);
            capacity -= item.weight();
        }
    }

    public String toString() {
        return ("Box: " + boxContents.size() + " items, total weight " + weight() + " kg");
    }

}
