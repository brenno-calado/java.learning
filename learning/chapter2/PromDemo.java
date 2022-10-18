package chapter2;
class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // coertion is not necessary because i is an integer

        b = (byte) (b * b); // coertion is necessary because this operation returns an integer;
        System.out.println("i and b: " + i + " " + b);

        char ch1 = 'a', ch2 = 'b';

        ch1 = (char) (ch1 + ch2); // the same applies to char, short, byte, which are smaller than int

        System.out.println("ch1 now is: " + ch1);

        long l1 = 1L, l2 = 2L;

        l1 = l1 + l2; // no coercion necessary as operations with long transforms all variables to long

        System.out.println("l1 now is: " + l1);
    }
}