public class Break5 {
    public static void main(String[] args) {
        done:
            for (int i = 0; i < 10; i++) {
                System.out.println("i is " + i);
                for (int j = 0; j < 10; j++) {
                    System.out.println("j is " + j);
                    for (int j2 = 0; j2 < 10; j2++) {
                        System.out.println("j2 is " + j2);

                        if (j2 == 5) break done;
                    }
                    System.out.println("After j2 loop");
                }
                System.out.println("After j loop");
            }
            System.out.println("After i loop");
    }
}
