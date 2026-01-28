package Assigment_1;

public class Question7<E> {
    public static void main(String[] args) {

    }

    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; }
    }

    private Node<E> head;

    // السؤال 7: ميثود للبحث عن عنصر وإرجاع موقعه
    public int q7_search(E target) {
        Node<E> curr = head;
        int index = 0;
        while (curr != null) {
            if (curr.data.equals(target)) return index;
            curr = curr.next;
            index++;
        }
        return -1;
    }
}