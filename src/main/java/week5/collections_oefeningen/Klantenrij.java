package week5.collections_oefeningen;

import java.util.LinkedList;
import java.util.Queue;

public class Klantenrij {
    public static void main(String[] args) {
        Queue<String> client = new LinkedList<String>();
        client.offer("Klant A");
        client.offer("Klant B");
        client.offer("Klant C");
        System.out.println(client);
        System.out.println(client.poll());
        System.out.println(client);
        System.out.println("Queue's head: " + client.peek());
        System.out.println(client);
    }


}
