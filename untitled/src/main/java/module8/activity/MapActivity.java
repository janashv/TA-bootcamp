package module8.activity;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {
    public static void main(String[] args) {

        //HashMap
        Map<String, String> map = new HashMap<>();

        map.put("1", "Kira");
        map.put("2", "Mike");
        map.put("3", "Anna");
        map.put("4", "Bob");

        //call print method
        MapActivity obj = new MapActivity();
        obj.print(map);
    }

    void print(Map map) {
        //print map using iteration
        for (Object key : map.keySet()) {
            System.out.println("Key: " + key + " -> Value: " + map.get(key));
        }
    }
}
