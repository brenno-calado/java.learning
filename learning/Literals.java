class Literals {
    public static void main(String[] args) {
        boolean toBe = true; // 1 bit.
        byte maxByte = 127; // 8 bits or 1 byte.
        char percentage = '%'; // 16 bits or 2 bytes. ASCII values.
        short maxShort = 32_767; // 16 bits or 2 bytes.
        int octalPermission = 0715; // Octal representing chmod permissions rwx--xr-x.
        int maxInt = 2_147_483_647; // 32 bits or 4 bytes. Default number.
        int red = 0xff, green = 0x57, blue = 0x51; // 255, 87, 51 in hexadecimals.
        int theAnswerInBinary = 0b101010; // 42 in binary.
        float maxFloat = 3.4028235E+38f; // 32 bits or 4 bytes.
        double maxDouble = 1.7976931348623157E+308;
        long maxLong = 9_223_372_036_854_775_807L; // 64 bits or 8 bytes.
        String testingString = "\f\tthis is a test\n";

        System.out.println("to be or not to be? " + toBe +
            "\n Max Byte allowed is: " + maxByte +
            "\n a char such as " + percentage + " can be increased to another character. Now it is " + ++percentage +
            "\n Max Short is: " + maxShort +
            "\n a 715 octal in decimal is equal to: " + octalPermission +
            "\n Max int is: " + maxInt +
            "\n a color in hexadecimals is equal to: (" + red + ", " + green + ", " + blue + ")" +
            "\n 101010 in binary is equal to: " + theAnswerInBinary +
            "\n Max float is: " + maxFloat +
            "\n Max double is " + maxDouble +
            "\n Max long is: " + maxLong
        );
        System.out.println("You can access the max values of the primitive types by accessing the static classes for each primary type, e.g.: Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println(testingString);
    }
}