package chapter2;
class Increment {
    public static void main(String[] args) {
        int x = 1;
        int y = x + 1;

        System.out.println("y = x + 1 does not modify x and store x + 1 at y");
        System.out.println("x = " + x + "\ny = " + y);

        y = x++;

        System.out.println("\ny = x++ increases only the x and stores at y the last x value");
        System.out.println("x = " + x + "\ny = " + y);

        y = ++x;

        System.out.println("\ny = ++x increases the x and stores at y the new x value");
        System.out.println("x = " + x + "\ny = " + y);
    }
}