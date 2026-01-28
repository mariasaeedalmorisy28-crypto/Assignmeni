package Assigment_1;

public class Question13<E> {

    // تعريف العقدة (Node)
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; }
    }

    private Node<E> tail = null;
    private int size = 0;

    // السؤال 13: دالة الإضافة في موقع محدد في قائمة دائرية
    public void q13_addAt(int index, E element) {
        if (index < 0 || index > size) return;
        Node<E> newest = new Node<>(element);

        if (size == 0) { // الحالة 1: القائمة فارغة
            tail = newest;
            tail.next = tail;
        } else if (index == 0) { // الحالة 2: الإضافة في البداية
            newest.next = tail.next;
            tail.next = newest;
        } else { // الحالة 3: الإضافة في المنتصف أو النهاية
            Node<E> curr = tail.next;
            for (int i = 0; i < index - 1; i++) curr = curr.next;
            newest.next = curr.next;
            curr.next = newest;
            if (index == size) tail = newest;
        }
        size++;
    }

    // دالة الطباعة للتأكد من أن القائمة تدور
    public void printList() {
        if (tail == null) return;
        Node<E> curr = tail.next;
        for (int i = 0; i < size; i++) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("(العودة للبداية)");
    }

    // دالة الـ main لتفعيل زر الـ Run
    public static void main(String[] args) {
        Question13<Integer> list = new Question13<>();

        list.q13_addAt(0, 10); // إضافة 10 في الموقع 0
        list.q13_addAt(1, 30); // إضافة 30 في الموقع 1
        list.q13_addAt(1, 20); // إضافة 20 في المنتصف (موقع 1)

        System.out.println("اختبار القائمة الدائرية:");
        list.printList();
    }
}