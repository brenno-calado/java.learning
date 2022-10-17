class CastDemo {
    public static void main(String[] args) {
        double x = 10.0, y = 3.0;
        byte b;
        int i;
        char ch;

        i = (int) (x / y);
        System.out.println("integer outcome of x / y is " + i);

        b = (byte) i;
        System.out.println("value of b is " + b);

        i = 257;
        b = (byte) i; // i is greater than Byte.MAX_VALUE
        System.out.println("byte b has integer i, but they differ because Byte max value is " + Byte.MAX_VALUE + ". b is " + b + " and i is "+ i);

        b = 88; // 88 equals x in ASCII
        ch = (char) b;
        System.out.println("ch is " + ch);
    }
}