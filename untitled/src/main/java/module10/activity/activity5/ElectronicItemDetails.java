package module10.activity.activity5;

import java.util.HashMap;

public class ElectronicItemDetails {

    //returns price of given item from the hashmap.
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        if (itemHashMap.containsKey(name)) {
            return itemHashMap.get(name);
        } else {
            System.out.println("Item not found: " + name);
            return 0;
        }
    }

    public static void main(String[] args) {
        // HashMap
        HashMap<String, Double> itemHashMap = new HashMap<>();

        //items
        itemHashMap.put("TV", 100.0);
        itemHashMap.put("Refrigerator", 83.0);
        itemHashMap.put("Washing Machine", 70.9);
        itemHashMap.put("Laptop", 570.0);

        //object
        ElectronicItemDetails obj = new ElectronicItemDetails();

        System.out.println("Price of TV is " +
                obj.returnPriceOfItem(itemHashMap, "TV"));
    }
}