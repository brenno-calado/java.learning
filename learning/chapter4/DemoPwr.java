package chapter4;

public class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.base + " raised to the " + x.exponent + " power equals " + x.total);
        System.out.println(y.base + " raised to the " + y.exponent + " power equals " + y.total);
        System.out.println(z.base + " raised to the " + z.exponent + " power equals " + z.total);
    }
}
