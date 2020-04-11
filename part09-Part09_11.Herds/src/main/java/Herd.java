
import java.util.ArrayList;

public class Herd implements Movable {

    //ArrayList of 'Movable' things (any classes that implements Movable)
    private ArrayList<Movable> temp;

    public Herd() {
        temp = new ArrayList<>();
    }

    //Returns a string representation of the positions of the members of the herd, each on its own line.
    public String toString() {
        String text = "";
        for (Movable item : temp) {
            text += item + "\n";
        }

        return text;
    }

    //Adds an object that implements the 'Movable' interface to the herd.
    public void addToHerd(Movable movable) {
        temp.add(movable);
    }

    //Moves the herd with by the amount specified by the parameters.
    public void move(int dx, int dy) {
        for (Movable item : temp) {
            item.move(dx, dy);
        }
    }

}
