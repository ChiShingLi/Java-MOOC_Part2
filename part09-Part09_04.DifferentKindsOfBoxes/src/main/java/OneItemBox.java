// part 3

/*
has the capacity of exactly one item. 
If there is already an item in the box, it must not be switched. 
The weight of the item added to the box is irrelevant.
 */
import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> itemList;

    public OneItemBox() {
        itemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (itemList.isEmpty()) {
            itemList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return itemList.contains(item);
    }
    
    

}
