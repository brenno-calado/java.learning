package chapter3;

public class WhitespaceCounter {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int spaceCounter = 0;

        do {
            ch = (char) System.in.read();

            if (ch == ' ') spaceCounter++;

        } while (ch != '.' & ch != '\n');

        System.out.println(spaceCounter);
    }
}
