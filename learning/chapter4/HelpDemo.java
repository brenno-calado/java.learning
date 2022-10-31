package chapter4;

public class HelpDemo {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;

        Help help = new Help();

        for(;;) {
            do {
                help.showMenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!help.isOptionValid(choice));

            if (choice == 'q') break;

            help.helpon(choice);
        }
    }
}
