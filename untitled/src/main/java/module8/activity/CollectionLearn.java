package module8.activity;

import java.util.*;

public class CollectionLearn {

    //collections
    static ArrayList<String> list = new ArrayList<>();
    static HashSet<String> set = new HashSet<>();
    static HashMap<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        //adding 10 values
        for (int i = 1; i <= 10; i++) {
            addValue("Name" + i);
        }
        System.out.println("Initial Collections: ");
        printAll();

        //adding duplicate
        addValue("Name1");

        //replacing the value
        replaceValue("Name2", "NewName2");

        //removing the value
        removeValue("Name3");

        System.out.println("\nAfter operations: ");
        printAll();
    }

    //add method
    public static void addValue(String value) {

        //list allows duplicates that we prevent manually
        if (!list.contains(value)) {
            list.add(value);
        }

        //set prevents duplicates
        set.add(value);

        //key must be unique
        if (!map.containsValue(value)) {
            map.put(map.size() + 1, value);
        } else {
            System.out.println("Duplicate not allowed: " + value);
        }
        }
    //remove method
    public static void removeValue(String value) {
        list.remove(value);
        set.remove(value);
        //remove from map by value
        map.values().remove(value);
    }
    //replace method
    public static void replaceValue(String oldValue, String newValue) {
        if (list.contains(newValue) || set.contains(newValue) || map.containsValue(newValue)) {
            System.out.println("Duplicate replacement not allowed: " + newValue);
            return;
        }
        //replace in list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldValue)) {
                list.set(i, newValue);
            }
        }
        //replace in set
        if (set.remove(oldValue)) {
            set.add(newValue);
        }
        //replace in map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(oldValue)) {
                entry.setValue(newValue);
            }
        }
     }
    //print all collections
    public static void printAll() {
        System.out.println("\nArrayList: ");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("\nHashSet: ");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("\nHashMap: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}