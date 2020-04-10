
public interface TacoBox {

    //return the number of tacos remaining in the box.
    int tacosRemaining();

    //reduces the number of tacos remaining by one.
    //The number of tacos remaining can't become negative.
    void eat();
}
