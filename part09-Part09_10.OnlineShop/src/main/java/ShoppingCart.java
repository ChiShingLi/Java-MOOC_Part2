
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    /*
    ShoppingCart stores products added there as Item-objects. 
    ShoppingCart must have an instance variable with either the Map<String, Item> type, 
    or the List<Item> type.
     */
    //adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
    public void add(String product, int price) {

        //check if item already exsits
        if (!(cart.containsKey(product))) {
            //create Item object on the fly & add it to the shopping cart
            cart.put(product, new Item(product, 1, price));
        } else {
            //increase the quantity in the item instead of creating a new one
            cart.get(product).increaseQuantity();
        }
    }

    //returns the total price of the shopping cart.
    public int price() {
        int sum = 0;
        //loop thru the shopping cart's map
        for (Item item : cart.values()) {
            //add up all the values
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        //for each item in cart, print it out
        for (Item item : cart.values()) {
            System.out.println(item.toString());
        }
    }

}
