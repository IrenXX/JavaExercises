package ArrayListWork;

import java.util.Stack;
import java.util.Vector;

public class VectorWork {
    public static void main(String[] args) {
        Vector <String> v = new Vector();
        v.add("A");
        v.add("B");
        v.add("C");
//        System.out.println(v);
//        System.out.println(v.firstElement());
//        v.remove(2);
//        System.out.println(v);
//        System.out.println(v.get(1));

        Stack  <String>stack = new Stack();
        stack.push("Ida");
        stack.push("Tom");
        stack.push("Bob");
        System.out.println(stack);
//        while(!stack.isEmpty()) {
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
