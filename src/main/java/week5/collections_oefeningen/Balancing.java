package week5.collections_oefeningen;

import java.util.Stack;

public class Balancing {
    public static void main(String[] args) {
        System.out.println("([]) → " + isBalanced("([])"));
        System.out.println("{[)] → " + isBalanced("{[)]"));
        System.out.println("((( → " + isBalanced("((("));

    }

    public static boolean isBalanced(String expr) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }


        return stack.isEmpty();

    }
}


//Schrijf een methode isBalanced die een String-expressie, zoals "{[()]}",
// controleert op correct gebalanceerde haakjes ((), [], {}).
//Gebruik een Stack<Character>:
//Als je een openend haakje ((, [, {) tegenkomt, push() je het naar de stack.
//Als je een sluitend haakje ()}, ], )) tegenkomt, pop() je het bovenste element
// en controleer je of het overeenkomt met het type sluitend haakje. Zo niet,
// dan is de expressie ongeldig.
//Nadat je de hele string hebt doorlopen, moet de stack leeg zijn om als geldig te worden beschouwd.
//Test met: "([])" (geldig), "{[)]" (ongeldig), "(((" (ongeldig).