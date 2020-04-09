
public class Main {

    public static void main(String[] args) {

        // part 1
//        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
//        juice.addToWarehouse(1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        System.out.println(juice);           // balance = 988.7, space left 11.3
        // part 2
//        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
//        juice.addToWarehouse(1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        juice.addToWarehouse(1.0);
//        System.out.println(juice);
        // part 5
        // the usual:
//        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        juice.addToWarehouse(1.0);
//        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3
        //  System.out.println(juice.history()); // [1000.0]
        //part 6
//        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        juice.takeFromWarehouse(1.0);
//        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3
//
//        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
        //part 7
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
//System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
    }

}
