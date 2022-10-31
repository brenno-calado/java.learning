public class Help3 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore;

        for (;;) {
            do {
                System.out.println("Need some help?\n1. if\n2. switch\n3. for\n4. while\n5. do-while\n6. break\n7. continue");
                System.out.println("Press q to quit.");
                System.out.print("Press a number to get a hint: ");
                ch = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while ((ch < '1' | ch > '7') & ch != 'q');

            if (ch == 'q') break;

            System.out.println();

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
                case '6':
                    System.out.println("statement;\nbreak;\n");
                    System.out.println("label: \n...code...\nbreak label;");
                    break;
                case '7':
                    System.out.println("statement;\ncontinue;\n");
                    System.out.println("label: \n...code...\ncontinue label;");
                    break;
            }
        }
    }
}
