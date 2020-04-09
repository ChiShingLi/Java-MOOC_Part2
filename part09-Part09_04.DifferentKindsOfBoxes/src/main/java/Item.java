import java.util.Objects;
        
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    // part1
    //implement .hashCode() and .equals() method for comparing lists and collections
    //ignore the item's weight
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object comparingObj) {
        //comparing this
        if (this == comparingObj) {
            return true;
        }

        //check if they are the same instance
        if (!(comparingObj instanceof Item)) {
            return false;
        }

        //convert the Object into Item and check
        Item comparingObj2 = (Item) comparingObj;
        if (this.name.equals(comparingObj2.name) ) {
            return true;
        }

        return false;
    }

}
