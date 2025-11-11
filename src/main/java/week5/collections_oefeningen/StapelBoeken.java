package week5.collections_oefeningen;

import java.util.Stack;

public class StapelBoeken {
    public static void main(String[] args) {
        Stack<String> book = new Stack<>();
        book.push("Boek 1");
        book.push("Boek 2");
        book.push("Boek 3");

        System.out.println("Initial Stack: " + book);
        System.out.println("Popped element :  " + book.pop());
        System.out.println("The element at the top of the book list is  :  " + book.peek());
    }
}
