package chapter3;

class Help {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        System.out.println("Need some help?\n1. if\n2. switch");
        System.out.print("Press a number to get a hint: ");
        ch = (char) System.in.read();

        switch (ch) {
            case '1':
                System.out.println("if (condition) {\n\tvalue\n}");
                break;
            case '2':
                System.out.println("switch (key) {\n\tcase value:\n\t\n\t\tbreak;\n\t\n\tdefault:\n\t\tbreak;\n}");
                break;
            default:
                break;
        }
    }
}