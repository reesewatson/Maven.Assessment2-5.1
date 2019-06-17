package rocks.zipcode.assessment2.collections;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    Map<String, Integer> inventory;
    List<String> strings;


    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        Map<String, Integer> inventory = new TreeMap<>();
        for (String string : strings) {
            if (!inventory.containsKey(string)) {
                inventory.put(string, 1);
            }
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

        strings.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        strings.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        return strings.size();
    }
}
