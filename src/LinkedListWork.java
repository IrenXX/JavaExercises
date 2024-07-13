import java.util.LinkedList;

public class LinkedListWork {
    public static void main(String[] args) {
        char[] elements = "{{}}([])(([()]()))".toCharArray();
        System.out.println(checkList(elements));

    }

    public static boolean checkList(char[] elements) {
        LinkedList list = new LinkedList<>();
        for (char el : elements) {
            if (el == '{' || el == '(' || el == '[') {
                list.push(el);
            }
            if (el == '}' || el == ')' || el == ']') {
                if (list.size() == 0) return false;
                list.pop();
            }
        }
        if (list.size() != 0) return false;
        return true;
    }

}


