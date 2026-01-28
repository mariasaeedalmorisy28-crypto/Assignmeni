package Assigment_1;

public class Question15<E> {

    // تعريف العقدة داخل الكلاس بشكل صحيح
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; }
    }

    private Node<E> tail = null;
    private int size = 0;

    // السؤال 15: ميثود البحث في قائمة دائرية
    public boolean q15_search(E target) {
        if (tail == null) return false;
        Node<E> curr = tail.next; // البدء من الرأس
        for (int i = 0; i < size; i++) {
            if (curr.data.equals(target)) return true;
            curr = curr.next;
        }
        return false;
    }

    // ميثود لإضافة البيانات (للتجربة)
    public void add(E data) {
        Node<E> newest = new Node<>(data);
        if (tail == null) {
            tail = newest;
            tail.next = tail;
        } else {
            newest.next = tail.next;
            tail.next = newest;
            tail = newest;
        }
        size++;
    }

    // دالة الـ main (تأكد أنها داخل حدود الكلاس الكبير)
    public static void main(String[] args) {
        Question15<String> list = new Question15<>();
        list.add("Java");
        list.add("Data");
        list.add("Structure");

        String searchFor = "Data";
        System.out.println("البحث عن: " + searchFor);

        if (list.q15_search(searchFor)) {
            System.out.println("النتيجة: العنصر موجود في القائمة");
        } else {
            System.out.println("النتيجة: العنصر غير موجود");
        }
    }
}