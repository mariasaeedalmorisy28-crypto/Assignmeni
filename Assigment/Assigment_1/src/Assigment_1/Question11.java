package Assigment_1;

public class Question11<E> {

    // تعريف العقدة الثنائية (Doubly Node)
    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev; // مؤشر للعنصر السابق
        Node(E data) { this.data = data; }
    }

    private Node<E> head;
    private Node<E> tail; // نحتاج الذيل للبدء بالعكس

    // السؤال 11: ميثود للاجتياز العكسي وطباعة العناصر
    public void q11_reverseTraverse() {
        Node<E> curr = tail; // نبدأ من آخر عنصر
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev; // نتحرك للخلف
        }
        System.out.println();
    }

    // دالة التشغيل للتجربة
    public static void main(String[] args) {
        Question11<Integer> list = new Question11<>();

        // بناء قائمة بسيطة يدوياً: 10 <-> 20
        Node<Integer> first = new Node<>(10);
        Node<Integer> second = new Node<>(20);

        list.head = first;
        list.tail = second;

        first.next = second;
        second.prev = first;

        System.out.print("طباعة العناصر بشكل عكسي: ");
        list.q11_reverseTraverse();
    }
}