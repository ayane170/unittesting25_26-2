package week5.collections_oefeningen;

import java.util.HashMap;
import java.util.Map;

public class Woordfrequentie {
    public static void main(String[] args) {
        String zin = "Java is leuk en Java is krachtig maar programmeren met Java vraagt oefening.";
        zin = zin.replaceAll("[^a-zA-Z ]", "");
        String[] woordKey = zin.toLowerCase().split(" ");
        Map<String, Integer> counts = new HashMap<>();

        for (String woord : woordKey) {
            counts.put(woord, counts.getOrDefault(woord, 0) + 1);
        }
        System.out.println(counts);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
}
