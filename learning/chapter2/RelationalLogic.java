package chapter2;
class RelationalLogic {
    public static void main(String[] args) {
        int t = 10, e = 11;
        boolean b1 = true, b2 = false;

        if (t < e) System.out.println("t < e");
        if (t <= e) System.out.println("t <= e");
        if (t != e) System.out.println("t != e");
        if (t == e) System.out.println("t == e");
        if (t >= e) System.out.println("t >= e");
        if (t > e) System.out.println("t > e");

        if (b1 & b2) System.out.println("b1 & b2 evaluate both values. does not print as both variables are not true");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) both values are true is not a valid statement");
        if (b1 | b2) System.out.println("b1 | b2 evaluates both values. One of the values is true");
        if (b1 ^ b2) System.out.println("b1 ^ b2 is true since their values differ");
    }
}