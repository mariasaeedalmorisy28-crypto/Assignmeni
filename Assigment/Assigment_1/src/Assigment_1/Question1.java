package Assigment_1;

public class Question1 {
    public static void main(String[] args) {

    }

    // السؤال 1: دالة لنسخ المصفوفة
    // هذا الكود يعتمد على ميزة جاهزة في جافا تسمى clone
    public static int[] q1_cloneArray(int[] original) {
        if (original == null) {
            return null;
        }
        return original.clone();
    }


}