package chapter3;

class EmptyFor {
    public static void main(String[] args) {
        int i = 0;

        // for (;;) {} is infinite
        // for (;;) ; is infinite
        for (; i < 10;) {
            System.out.println("Pass #" + i);
            i++;
        }
    }
}