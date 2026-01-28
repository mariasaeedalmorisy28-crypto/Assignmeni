package Assigment_1;

public class Question9<E> {
    // تعريف العقدة (Node)
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; }
    }

    private Node<E> head;
    private int size;

    // السؤال 9: ميثود الحذف من موقع معين
    public void q9_removeAt(int index) {
        if (head == null || index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
        } else {
            Node<E> curr = head;
            for (int i = 0; i < index - 1; i++) curr = curr.next;
            curr.next = curr.next.next;
        }
        size--;
    }

    // دالة التشغيل للتجربة
    public static void main(String[] args) {
        Question9<Integer> q = new Question9<>();
        // إضافة يدوية سريعة للتجربة
        q.head = new Node<>(10);
        q.head.next = new Node<>(20);
        q.size = 2;

        q.q9_removeAt(1); // حذف العنصر الثاني
        System.out.println("Done! First element is: " + q.head.data);
    }
}