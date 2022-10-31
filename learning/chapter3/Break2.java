package chapter3;

public class Break2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        for (;;) {
            ch = (char) System.in.read();

            if (ch == 'q') break;
        }

        System.out.println("You pressed q and got out of the infinite loop!");
    }
}
