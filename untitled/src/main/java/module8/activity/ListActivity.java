package module8.activity;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {

        //list of names using ArrayList
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mike");
        names.add("Shanti");
        names.add("Stacie");

        //calling print method
        print(names);
    }

    static void print(List list) {

        //print elements of the list
        for (Object name : list) {
            System.out.println(name);
        }
    }
}