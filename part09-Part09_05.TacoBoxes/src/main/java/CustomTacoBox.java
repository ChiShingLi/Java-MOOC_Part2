
public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
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
