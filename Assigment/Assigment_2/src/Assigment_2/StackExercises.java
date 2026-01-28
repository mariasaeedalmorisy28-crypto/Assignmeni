package Assignment_2;

import java.util.Stack;

public class StackExercises {

    // السؤال 1: ميثود لعكس نص (String) باستخدام (Stack)
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    // السؤال 2: ميثود لترتيب عناصر الستيك باستخدام ستيك آخر فقط
    public static void sortStack(Stack<Integer> s1) {
        Stack<Integer> s2 = new Stack<>();

        while (!s1.isEmpty()) {
            int temp = s1.pop();
            while (!s2.isEmpty() && s2.peek() > temp) {
                s1.push(s2.pop());
            }
            s2.push(temp);
        }

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // دالة التشغيل لرؤية النتائج في الكونسول
    public static void main(String[] args) {
        // تجربة السؤال 1: عكس الكلمة
        String original = "Java";
        String reversed = reverseString(original);
        System.out.println("النص الأصلي: " + original);
        System.out.println("النص المعكوس: " + reversed);

        System.out.println("--------------------");

        // تجربة السؤال 2: ترتيب الستيك
        Stack<Integer> s1 = new Stack<>();
        s1.push(30);
        s1.push(10);
        s1.push(50);
        s1.push(20);

        System.out.println("الستيك قبل الترتيب (من الأعلى): " + s1);
        sortStack(s1);
        System.out.println("الستيك بعد الترتيب (من الأصغر للأكبر): " + s1);
    }
}