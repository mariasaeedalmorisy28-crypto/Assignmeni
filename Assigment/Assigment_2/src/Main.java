package Assignment_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //  السؤال 1: عكس النص باستخدام Stack
        String text = "Java";
        System.out.println("1. عكس النص الأصلي (Java): " + StackExercises.reverseString(text));

        //  السؤال 2: ترتيب الـ Stack
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(10);
        s.push(50);
        s.push(20);
        System.out.print("2. الستيك قبل الترتيب: [30, 10, 50, 20] -> ");
        StackExercises.sortStack(s);
        System.out.println("بعد الترتيب: " + s);

        //  السؤال 3: عكس الـ Queue باستخدام Stack
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.print("3. الطابور قبل العكس: [1, 2, 3] -> ");
        QueueExercises.reverseQueue(q);
        System.out.println("بعد العكس: " + q);

        // --- السؤال 5: دمج طابورين مرتبين ---
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(3);
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(2);
        q2.add(4);
        Queue<Integer> result = QueueExercises.mergeSortedQueues(q1, q2);
        System.out.println("5. دمج الطابورين [1,3] و [2,4] هو: " + result);

        System.out.println("===============================");
    }
}