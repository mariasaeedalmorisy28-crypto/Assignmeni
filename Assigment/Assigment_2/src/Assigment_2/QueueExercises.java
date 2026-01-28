package Assignment_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;

public class QueueExercises {

    // السؤال 3: ميثود لعكس ترتيب العناصر داخل (Queue)
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // السؤال 4: تطبيق طابور الأولويات (يخرج العنصر الأصغر أولاً)
    public static void priorityQueueExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);

        System.out.println("عناصر PriorityQueue عند الخروج (الأصغر أولاً):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // سيطبع 5 ثم 10 ثم 20
        }
        System.out.println();
    }

    // السؤال 5: دمج طابورين مرتبين في طابور واحد كبير ومرتب
    public static Queue<Integer> mergeSortedQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> merged = new LinkedList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                merged.add(q1.remove());
            } else {
                merged.add(q2.remove());
            }
        }
        while (!q1.isEmpty()) merged.add(q1.remove());
        while (!q2.isEmpty()) merged.add(q2.remove());
        return merged;
    }

    // دالة التشغيل لتجربة الحلول
    public static void main(String[] args) {
        // تجربة السؤال 3 (عكس الطابور)
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3);
        System.out.println("الطابور قبل العكس: " + q);
        reverseQueue(q);
        System.out.println("الطابور بعد العكس: " + q);
        System.out.println("--------------------");

        // تجربة السؤال 4 (Priority Queue)
        priorityQueueExample();
        System.out.println("--------------------");

        // تجربة السؤال 5 (دمج طابورين مرتبين)
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10); q1.add(30);
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(20); q2.add(40);

        Queue<Integer> result = mergeSortedQueues(q1, q2);
        System.out.println("الناتج بعد دمج [10, 30] و [20, 40]: " + result);
    }
}