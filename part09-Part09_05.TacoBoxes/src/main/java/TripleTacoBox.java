// part 1
//Triple taco box

public class TripleTacoBox implements TacoBox {

    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    //return the number of tacos remaining in the box.
    @Override
    public int tacosRemaining() {
        return tacos;
    }

    //reduces the number of tacos remaining by one.
    //The number of tacos remaining can't become negative.
    @Override
    public void eat() {
        if (tacos > 0) {
            tacos--;
        }
    }

}
