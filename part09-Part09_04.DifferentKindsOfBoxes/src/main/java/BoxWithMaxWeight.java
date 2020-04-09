//part 2
//Box with a max weight

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> itemList;

    //defines the max weight allowed for the box.
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        itemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {

        //check if the item would exceed the max capacity
        if ((item.getWeight() <= capacity)) {
            itemList.add(item);

            //decrease the capacity  of the box
            capacity -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.itemList.contains(item);
    }

}
