// part 5

import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    //creates a product warehouse. The product name, capacity, and initial balance are provided as parameters. 
    //Set the initial balance as the initial balance of the warehouse, as well as the first value of the change history.
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        //add balance 1000 to the warehouse
        super.addToWarehouse(initialBalance);

        //create a new history at initState for storing records
        history = new ChangeHistory();
        history.add(initialBalance);
    }

    //returns the product history 
    // e.g -> [0.0, 119.2, 21.2]
    public String history() {
        return history.toString();
    }

    // part 6 - Product warehouse with history, step 2
    //works just like the method in the Warehouse class, 
    //but we also record the changed state to the history
    //override this method so that it's always call this one first
    @Override
    public void addToWarehouse(double amount) {
        //call super class (Warehouse)'s method to avoid duplicate
        super.addToWarehouse(amount);
       
        //the value recorded in the balance history after adding
        history.add(super.getBalance());
    }

    //works just like the method in the Warehouse class, 
    //but we also record the changed state to the history
    @Override
    public double takeFromWarehouse(double amount) {
        history.add(super.getBalance() - amount);
        return super.takeFromWarehouse(amount);

    }
    
    //prints history related information for the product
    public void printAnalysis(){       
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history.toString());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());     
    }

}
