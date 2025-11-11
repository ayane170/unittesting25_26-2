package week5.collections_oefeningen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Woordenteller {
    public static void main(String[] args) {
        String zin = "java is de taal van de programmeur en java is leuk";
        ArrayList<String> listWoord = new ArrayList<String>();
        String[] woord = zin.split(" ");

        for (String w : woord) {
            listWoord.add(w);
            System.out.println(w);
        }
        System.out.println("ListWoord size : " + listWoord.size());

        System.out.println("+++++++++++++++++++++++++++++++++");
        HashSet<String> uniqueList = new HashSet<>();
        for (String w : listWoord) {
            if (!uniqueList.contains(w)) {
                uniqueList.add(w);
                System.out.println(w);
            }
        }
        System.out.println("Unique Liste size : " + uniqueList.size());

        System.out.println("++++++++++++++++++++++++++++++++++");
        TreeSet<String> orderWord = new TreeSet<>(uniqueList);
        System.out.println("Alphabetical order : ");
        for (String w : orderWord) {
            System.out.println(w);
        }
    }


}
