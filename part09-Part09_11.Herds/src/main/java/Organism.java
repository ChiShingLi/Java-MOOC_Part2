// part 1

public class Organism implements Movable {

    private int x;
    private int y;

    // class constructor receives the x and y coordinates of the initial position as its parameters.
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Creates and returns a string representation of the organism
    public String toString() {
        return ("x: " + x + ";y: " + y);
    }

    //implements from 'Movable' interface
    //Moves the object by the values it receives as parameters. 
    public void move(int dx, int dy) {
        //increase x
        x += dx;
        y += dy;
    }

}
