

public class SinglyLinkedList<E> {
    protected Node<E> first;
    protected Node<E> last;
    protected int size = 0;

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addLast("1");
        list.addLast("3");
        list.addLast("2");
        list.addLast("4");
        list.addLast("5");
        list.print();
        System.out.println("\nRevers LinkedList");
        list.revers();
        System.out.println("\n********************");
        list.remove(-1);
        list.print();
        System.out.println("\n********************");
        list.remove(3);
        list.print();
    }

    private void revers() {
        Node<E> current = this.first;
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                current = current.next;
            }
            System.out.print(current.value + ", ");
            current = this.first;
        }
        System.out.print(current.value);

    }

    private void remove(int index) {
        if (index < 0 || index >= size) {
            System.err.println("\nУказанный индекс для удаления вне рамках списка");
            return;
        }
        if (size == 1) {
            first = null;
            last = null;
            size = 0;
            return;
        }
        Node<E> prev = this.first;
        if (prev.next == null) {
            last = prev;
        }

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        System.out.println((index + 1) + "-й элемент удаляемый в списке: " + prev.next.value);
        prev.next = prev.next.next;

        size--;
    }

    public void print() {
        Node<E> current = this.first;
        while (current != null) {
            System.out.print(current.value + ", ");
            current = current.next;
        }
    }

    private void addLast(E value) {
        Node<E> node = new Node<>(value, null);

        if (size == 0) {
            size++;
            first = node;
            last = node;
            return;
        }

        size++;
        last.next = node;
        last = node;
    }

    protected static class Node<E> {
        final E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }
}