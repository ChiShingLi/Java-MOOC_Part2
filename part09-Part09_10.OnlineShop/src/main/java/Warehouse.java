// part 1

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {

    //The object created can be a HashMap, but its type must be the Map-interface
    private Map<String, Integer> storage;
    private Map<String, Integer> stocks;

    public Warehouse() {
        storage = new HashMap<>();
        stocks = new HashMap<>();
    }

    //adds a product to the warehouse with the price and stock balance given as parameters.
    public void addProduct(String product, int price, int stock) {
        storage.put(product, price);
        stocks.put(product, stock);
    }

    //returns the price of the product it received as a parameter. 
    //if the product hasn't been added to the warehouse, the method must return -99.
    public int price(String product) {
        if (storage.containsKey(product)) {
            return storage.get(product); //get the price of the product
        }

        return -99;
    }

    //turns the current remaining stock of the product in the warehouse.
    //If the product hasn't been added to the warehouse, the method must return 0.
    public int stock(String product) {
        if (stocks.containsKey(product)) {
            return stocks.get(product);
        }
        return 0;
    }

    /*
    reduces the stock ramaining for the product it received as a parameter by one, 
    and returns true if there was stock remaining. 
    If the product was not available in the warehouse the method returns false.
    A products stock can't go below zero.
     */
    public boolean take(String product) {
        int selectedStock = stock(product);
        if (selectedStock > 0) {
            //reduce stock by 1 & update the stock
            selectedStock--;
            stocks.put(product, selectedStock);
            return true;
        }
        return false;
    }
    
    
    // returns the names of the products in the warehouse as a Set
    public Set<String> products(){
        
        //this works, since Hashmap/map and Set both implements from Collection
        Set<String> result = storage.keySet(); //return all the storage key sets to Set<String>
        return result;
    }

}
