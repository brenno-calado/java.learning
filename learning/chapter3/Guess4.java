package chapter3;
class Guess4 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = (char) (Math.random() * ('Z' - 'A') + 'A');

        do {
        System.out.println("I'm thinking of a letter between A and Z...");
        System.out.print("Can you guess it? Type a letter: ");

        ch = (char) System.in.read();

        do {
            ignore = (char) System.in.read();
        } while (ignore != '\n');

        ch = Character.toUpperCase(ch);
        if (ch == answer) System.out.println("** Right **");
        else {
            System.out.print("...Sorry, you're ");

            if (ch < answer) System.out.println("too low");
            else System.out.println("too high");

            System.out.println("Try again!\n");
        }

        } while (ch != answer);
    }
}