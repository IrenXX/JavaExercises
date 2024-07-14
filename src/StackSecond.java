public class StackSecond<E> extends SinglyLinkedList<E> {
    public static void main(String[] args) {
        StackSecond<String> stack = new StackSecond<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        stack.print();
        System.out.println("\nУдаляем элемент из стека - элемент со значением: "+stack.pop());
        stack.print();
        System.out.println("\nУдаляем элемент из стека - элемент со значением: "+stack.pop());
        stack.print();
    }

    private E pop() {
        if (size == 0) return null;
        if (size == 1) {
            last = null;
        }
        E value = first.value;
        first = first.next;
        size--;
        return value;
    }

    private void push(E element) {
        Node<E> node = new Node<>(element, first);
        first = node;
        size++;
        if (size == 0) {
            last = node;
        }
    }
}
