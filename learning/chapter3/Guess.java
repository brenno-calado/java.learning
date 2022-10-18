package chapter3;
class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = (char) (Math.random() * ('Z' - 'A') + 'A');

        System.out.println("I'm thinking of a letter between A and Z... Psst it's " + answer);
        System.out.print("Can you guess it? Type a letter: ");

        ch = (char) System.in.read();
        ch = Character.toUpperCase(ch);
        if (ch == answer) System.out.println("** Right **");
        else {
            System.out.print("...Sorry, you're ");

            if (ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }
    }
}