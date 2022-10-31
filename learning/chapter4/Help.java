package chapter4;

public class Help {
    void helpon(int what) {
        switch (what) {
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
        System.out.println();
    }

    void showMenu() {
        System.out.println("Need some help?\n1. if\n2. switch\n3. for\n4. while\n5. do-while\n6. break\n7. continue");
        System.out.println("Press q to quit.");
        System.out.print("Press a number to get a hint: ");
    }

    boolean isOptionValid(int option) {
        if ((option < '1' | option > '7') & option != 'q') return false;

        return true;
    }
}
