package chapter3;

class Comma {
    public static void main(String[] args) {
        int i, j;

        for (i = 0, j = 10; i <= j; i += 2, j -= 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}