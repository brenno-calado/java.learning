package chapter3;
class Help2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore;

        do {
            System.out.println("Need some help?\n1. if\n2. switch\n3. for\n4. while\n5. do-while");
            System.out.print("Press a number to get a hint: ");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (ch < '1' | ch > '5');

        switch (ch) {
            case '1':
                System.out.println("if (condition) {\n\tstatement\n}");
                break;
            case '2':
                System.out.println("switch (key) {\n\tcase value:\n\t\tstatement\n\t\tbreak;\n\t\n\tdefault:\n\t\tbreak;\n}");
                break;
            case '3':
                System.out.println("for (init; condition; iteration) {\n\tstatement\n}");
                break;
            case '4':
                System.out.println("while (condition) {\n\tstatement\n}");
                break;
            case '5':
                System.out.println("do {\n\tstatement\n} while (condition);");
                break;
            default:
                break;
        }
    }
}