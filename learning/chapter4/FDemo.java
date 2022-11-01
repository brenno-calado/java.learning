package chapter4;

public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    protected void finalize() {
        System.out.println("Finalizing " + x);
    }

    void generator(int i) {
        FDemo obj = new FDemo(i);
        System.out.print(obj + " ");
    }
}
