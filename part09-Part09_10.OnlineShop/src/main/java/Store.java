// part 8 - store

import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // the method that handles the customers visit to the store.
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

            // Add code here that adds the product to the cart,
            // IF there is any in the warehouse, and reduces the stock in the warehouse
            // Dont't do touch any of the other code!
            //if the product stock is more than 0
            if (warehouse.stock(product) > 0) {

                //add to cart and get the product price from the warehouse
                cart.add(product, warehouse.price(product));

                //decrease the product's stock in the warehouse by 1
                warehouse.take(product);
            }

        }

        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
