package chapter2;
class ShortCircuit {
    public static void main(String[] args) {
        int n = 10, d = 2;

        if (d != 0 && (n % d ) == 0) System.out.println(d + " is a factor of " + n);

        d = 0;

        if (d != 0 && (n % d ) == 0) System.out.println(d + " is a factor of " + n);

        if (d != 0 & (n % d ) == 0) System.out.println(d + " is a factor of " + n);
    }
}