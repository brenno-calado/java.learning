package chapter3;

class SqrRoot {
    public static void main(String[] args) {
        double num, sqroot, roundError;

        for (num = 0; num < 100.0; num++) {
            sqroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sqroot);

            roundError = num - (sqroot * sqroot);
            System.out.println("Rounding error is " + roundError + "\n");
        }
    }
}