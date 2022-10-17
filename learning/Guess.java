class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = (char) (Math.random() * ('Z' - 'A') + 'A');

        System.out.println("I'm thinking of a letter between A and Z...");
        System.out.print("Can you guess it? Type a letter: ");

        ch = (char) System.in.read();
        if (Character.toUpperCase(ch) == answer) System.out.println("** Right **");
        else System.out.println("... Sorry, you're wrong.");
    }
}