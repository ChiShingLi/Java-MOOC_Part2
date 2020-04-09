//part 3-2

// can add any items to misplacing box, but items can never be found when looked for
import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> itemList;

    public MisplacingBox() {
        itemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        itemList.add(item);
    }

    @Override
    //always return false 
    public boolean isInBox(Item item) {
        return false;
    }

}
