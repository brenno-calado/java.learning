package chapter3;

public class CountEvenNumbers {
    public static void main(String[] args) {
        for (int i = 1000; i >= 0; i -= 2) {
            System.out.print("\u001b[32m" + i + " ");
        }
        System.out.println();
    }
}
