package Assigment_1;

class Question3<E> {
    public static void main(String[] args) {

    }
    // تعريف العقدة داخل الكلاس
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; }
    }

    private Node<E> head;
    private int size;

    // السؤال 5: الكود الذي أرسلتَه أنت (وضعتُه هنا)
    public void q5_concatenate(Question3<E> other) {
        if (other.head == null) return;
        if (head == null) {
            head = other.head;
        } else {
            Node<E> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = other.head;
        }
        size += other.size;
    }
}