package Assigment_1;

public class Question5<E> {

    // تعريف العقدة داخل الكلاس
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; this.next = null; }
    }

    private Node<E> head;
    private int size;

    // دالة لإضافة عناصر للقائمة (لكي نتمكن من تجربتها)
    public void addLast(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
        size++;
    }

    // السؤال 5: الكود الذي أرسلته أنت (معدل ليعمل داخل الكلاس)
    public void q5_concatenate(Question5<E> other) {
        if (other == null || other.head == null) return;
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

    // دالة لطباعة القائمة
    public void printList() {
        Node<E> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // دالة التشغيل الرئيسية لكي يظهر لك زر المثلث الأخضر
    public static void main(String[] args) {
        Question5<Integer> list1 = new Question5<>();
        list1.addLast(1);
        list1.addLast(2);

        Question5<Integer> list2 = new Question5<>();
        list2.addLast(3);
        list2.addLast(4);

        System.out.print("List 1: "); list1.printList();
        System.out.print("List 2: "); list2.printList();

        list1.q5_concatenate(list2);

        System.out.print("بعد الدمج: "); list1.printList();
    }
}