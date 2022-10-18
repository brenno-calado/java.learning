package chapter3;
class NoBreak {
    public static void main(String[] args) {
        int i;
        String y = "a new condition";

        for (i = 0; i <= 6; i++) {
            switch (i) {
                case 1:
                    System.out.print(1);
                case 2:
                    System.out.print(2);
                case 3:
                    System.out.print(3);
                    break;
                case 4:
                case 5:
                    System.out.println("more than 3");
                    break;
                case 6:
                    switch (y) {
                        case "old condition":
                            System.out.println("run old method");
                            break;
                        case "a new condition":
                            System.out.println("run new method");
                        default:
                            System.out.println("Leaving internal switch");
                            break;
                    }
                default:
                    System.out.println("leaving external switch");
            }
            System.out.println();
        }
    }
}