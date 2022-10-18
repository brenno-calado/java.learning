package chapter2;
class ScopeDemo {
    public static void main(String[] args) {
        int x = 10;

        if (x == 10) {
            // int x = 0; breaks even though it is in a different scope
            int y = 20;
            System.out.println("X and Y " + x + " " + y);
            x = y * 2;
        }

        // y = 100 is not reachable.

        System.out.println("x is now " + x);
    }
}