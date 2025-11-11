package week_6.generics;

import java.util.ArrayList;

public class Generics {


    public static <T extends Comparable<T>> void findMax(T[] array) {
//        ArrayList<T> numbers = new ArrayList<>();
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0)
                max = element;
        }
        System.out.println("De hoogste waarde is: " + max);
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 5, 8, 10, 40};
        findMax(numbers);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        String[] strings = {"a", "b", "c", "d", "e", "f"};
        findMax(strings);
    }

}

