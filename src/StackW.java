
public class StackW {
    public static void main(String[] args) {
        System.out.println(checkBrevets("{{}}([])(([]()))".toCharArray()));
    }

    public static boolean checkBrevets(char[] elements) {
        Stack stack = new Stack();
        for (char el : elements) {
            if (el == '{' || el == '(' || el == '[') {
                stack.push(el);
            }
            if (el == '}' || el == ')' || el == ']') {
                Character previous = stack.pop();
                if (previous == null) {
                    return false;
                }
                if (!compareBrackets(previous, el)){
                    return false;
                }
            }
        }
        if (stack.pop()!=null) return false;
        return true;
    }

    public static boolean compareBrackets(Character left, Character right) {
        if ((left == '(' && right == ')') ||
                (left == '{' && right == '}') ||
                (left == '[' && right == ']')) {
        }
        return true;
    }
}

class Node {
    Character value;
    Node next;

    public Node(Character value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class Stack {
    Node head;

    public Stack() {
        this.head = null;
    }

    public void push(Character value) {
        this.head = new Node(value, this.head);
    }

    public Character pop() {
        if (this.head == null) return null;

        Character value = this.head.value;
        this.head = this.head.next;
        return value;
    }
}