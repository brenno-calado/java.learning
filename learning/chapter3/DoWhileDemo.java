package chapter3;
class DoWhileDemo {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        do {
            System.out.println("Press a key then ENTER: ");

            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}