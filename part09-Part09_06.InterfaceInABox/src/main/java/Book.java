
//part 1 - Packables
public class Book implements Packable {

    private String authur;
    private String title;
    private double weight;

    public Book(String authur, String title, double weight) {
        this.authur = authur;
        this.title = title;
        this.weight = weight;
    }

    //create the weight() method according to the Packable interface
    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return (authur + ": " + title);
    }

}
