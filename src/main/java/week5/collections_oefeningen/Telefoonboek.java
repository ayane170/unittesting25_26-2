package week5.collections_oefeningen;

import java.util.HashMap;

public class Telefoonboek {
    public static void main(String[] args) {
        HashMap<String, String> telefoon = new HashMap<>();
        telefoon.put("Dare", "0535283868");
        telefoon.put("Abdel", "0661147647");
        telefoon.put("Berlin", "04578882145");

        System.out.println("Het telefoonnummer is :  " +telefoon.get("Dare"));
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println(telefoon.containsKey("Abdel"));
        System.out.println(telefoon.containsKey("Hiba"));
        System.out.println("++++++++++++++++++++++++++++++++++");
        telefoon.put("Abdel", "04578882415");
        System.out.println(telefoon);
    }


}
