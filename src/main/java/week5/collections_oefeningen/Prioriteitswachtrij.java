package week5.collections_oefeningen;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prioriteitswachtrij {

    public static void main(String[] args) {
        PriorityQueue<String> p = makeQueue();

        System.out.println("start :" +p);

        while (!p.isEmpty()) {
            System.out.println("verwijder :  " + p.poll());
            System.out.println("huidige queue: "+p);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        PriorityQueue<String> ignoreCaseQueue = makeQueueIgnoreCase();
        System.out.println("start :" +ignoreCaseQueue);

        while (!ignoreCaseQueue.isEmpty()) {
            System.out.println("verwijder :  " + ignoreCaseQueue.poll());
            System.out.println("huidige queue: "+ignoreCaseQueue);
        }


    }

    public static  PriorityQueue<String> makeQueue() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("paard");
        queue.add("Motor");
        queue.add("Aardbei");
        queue.add("gitaar");
        queue.add("abc");
        return queue;
    }

    public static PriorityQueue<String> makeQueueIgnoreCase() {
        PriorityQueue<String> queue = new PriorityQueue<>(String.CASE_INSENSITIVE_ORDER) ;
        queue.add("paard");
        queue.add("Motor");
        queue.add("Aardbei");
        queue.add("gitaar");
        queue.add("abc");
        return queue;
    }
}
