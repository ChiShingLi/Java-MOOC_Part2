
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        storageUnits = new HashMap<>();
    }

    //adds the parameter item to the storage unit that is also given as a parameter.
    public void add(String unit, String item) {
        //if the values of the key not found
        if (!(storageUnits.containsKey(unit))) {
            //init storage hash map w/ ArrayList
            storageUnits.put(unit, new ArrayList<>());
        }

        //add back in the item to the storageUnit's ArrayList
        storageUnits.get(unit).add(item);
    }

    // returns a list that contains all the items in the storage unit indicated by the parameter. 
    // If there is no such storage unit or it contains no items, the method should return an empty list.
    public ArrayList<String> contents(String storageUnit) {
        //if the storageUnit content is null(empty) return an empty list
        if (storageUnits.get(storageUnit) == null) {
            return new ArrayList<>();
        }

        return storageUnits.get(storageUnit);
    }

    /*
    removes the given item from the given storage unit.  
    Only removes one item — if there are several items with the same name, 
    the rest still remain. 
    If the storage unit would be empty after the removal, the method also removes the unit.
     */
    public void remove(String storageUnit, String item) {
        //remove the item in the storage
        storageUnits.get(storageUnit).remove(item);

        //if the storageUnit is empty after removing the item, remove the storageUnits also
        if (storageUnits.get(storageUnit).isEmpty()) {
            storageUnits.remove(storageUnit);
        }
    }

    //returns the names of the storage units as a list. Only the units that contain items are listed.
    public ArrayList<String> storageUnits() {
        //create a list for holding all the keys
        ArrayList<String> unitList = new ArrayList();
        
        //loop thru the hashmap and add all the keySets to the unitList
        for (String unit : storageUnits.keySet()) {
            unitList.add(unit);
        }
        return unitList;
    }

}
