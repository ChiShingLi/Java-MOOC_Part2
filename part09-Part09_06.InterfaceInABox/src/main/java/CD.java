// part 1

public class CD implements Packable {

    private String singer;
    private String title;
    private int year;
  
    public CD(String singer, String title, int year) {
        this.singer = singer;
        this.title = title;
        this.year = year;
    }

    //create the weight() method according to the Packable interface
    @Override
    public double weight() {
        //the weight of CD is defaulted to 0.1
        return 0.1;
    }

    @Override
    public String toString() {
        return (singer + ": " + title + " (" + year + ")");
    }

}
