package week5.collections_oefeningen;

import java.util.ArrayList;

public class ArrayListOe {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        System.out.println(names);
        names.add(1,"adam");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
        System.out.println(names.size());
    }
}
