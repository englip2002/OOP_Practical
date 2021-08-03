package Practical3;

public class P3Q2 {
    public static void main(String[] args) {
        int list[] = { 1, 2, 4, 5, 10, 100, 2, -22 };
        System.out.println("The index of the smallest number is " + smallestElement(list));
    }

    public static int smallestElement(int[] arr) {
        int smallestIndex = 0;
        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] < arr[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;


    }
}
