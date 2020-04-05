
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    // Part 2: Pairing plates with owners
    private HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry() {
        hashmap = new HashMap<>();
    }

    /*
    assigns the owner it received as a parameter to car corresponding with the license plate received as a parameter. 
    If the license plate didn't have an owner returns true.
    If the license already had an owner attached, the method returns false and does nothing.
     */
    public boolean add(LicensePlate licensePlate, String owner) {
        //check if the lincense Plate have owner or not
        if (hashmap.get(licensePlate) == null) {
            hashmap.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    //returns the owner of the car corresponding to the license plate received as a parameter. 
    //If the car isn't in the registry, returns null.
    public String get(LicensePlate licensePlate) {
        //check if the we can get the licensePlate from the hashmap
        //can use .containsKey() method too
        if (hashmap.get(licensePlate) == null) {
            return null;
        }
        return hashmap.get(licensePlate);
    }

    //removes the license plate and attached data from the registry. 
    //Returns true if removed successfully and false if the license plate wasn't in the registry.
    public boolean remove(LicensePlate licensePlate) {
        if (hashmap.containsKey(licensePlate)) {
            hashmap.remove(licensePlate);
            return true;
        }
        return false;

    }

    // --- Part2 ends ---
    // --- Part3 starts ---
    //prints the license plates in the registry.
    public void printLicensePlates() {
        //print each hashmap's key
        for (LicensePlate item : hashmap.keySet()) {
            //print using the overridden .toString() method from  LicensePlates class
            System.out.println(item);
        }
    }

    //prints the owners of the cars in the registry. 
    //Each name should only be printed once, even if a particular person owns more than one car.
    public void printOwners() {
        //create a list to keep track of printed owners
        ArrayList<String> ownerList = new ArrayList<>();

        for (String owner : hashmap.values()) {
            //check for duplicate owner
            if (!(ownerList.contains(owner))) {
                System.out.println(owner);

                //add owner name to the list, so that we only print once.
                ownerList.add(owner);
            }
        }

    }

}
