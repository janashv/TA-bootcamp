package module8.activity;


import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class HashSetActivity {
    public static void main(String[] args) {

        //creates HashSet with 10 names
        Set<String> names = new HashSet<>();

        names.add("Anna");
        names.add("Jana");
        names.add("Ilmars");
        names.add("Nikita");
        names.add("Disha");
        names.add("Kira");
        names.add("Masha");
        names.add("Barsik");
        names.add("Sharik");
        names.add("Ivan");

        System.out.println("Initial Set:");
        print(names);

        //add duplicate values
        names.add("Anna");
        names.add("Disha");

        System.out.println("\nAfter adding duplicates:");
        print(names);

        //removes 2 values
        names.remove("Jana");
        names.remove("Kira");

        System.out.println("\nAfter removing elements:");
        print(names);

        //convert to list to simulate index
        ArrayList<String> list = new ArrayList<>(names);

        int index = list.indexOf("Disha");

        if (index != -1) {
            System.out.println("\nDisha found at index: " + index + " in the list");
        } else {
            System.out.println("\nDisha was not found");
        }
    }

    //method to print set
    public static void print(Set<String> set) {
        for (String name : set) {
            System.out.println(name);
        }
    }
}