package week5.collections_oefeningen;

import java.util.HashSet;

public class oefeningSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        System.out.println(numbers);
        System.out.println(numbers.contains(30));


    }

}
