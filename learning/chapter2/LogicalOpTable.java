package chapter2;
class LogicalOpTable {
    public static void main(String[] args) {
        boolean t = true, f = false;
        System.out.println("|\tA\t|\tB\t|\tAND\t|\tOR\t|\tXOR\t|\tNOT\t|");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|" + boolToStrNum(t) + "|" + boolToStrNum(t) + "|" + boolToStrNum(t & t) + "|" + boolToStrNum(t | t) + "|" + boolToStrNum(t ^ t) + "|" + boolToStrNum(!(t | t)) + "|");
        System.out.println("|" + boolToStrNum(t) + "|" + boolToStrNum(f) + "|" + boolToStrNum(t & f) + "|" + boolToStrNum(t | f) + "|" + boolToStrNum(t ^ f) + "|" + boolToStrNum(!(t | f)) + "|");
        System.out.println("|" + boolToStrNum(f) + "|" + boolToStrNum(t) + "|" + boolToStrNum(f & t) + "|" + boolToStrNum(f | t) + "|" + boolToStrNum(f ^ t) + "|" + boolToStrNum(!(f | t)) + "|");
        System.out.println("|" + boolToStrNum(f) + "|" + boolToStrNum(f) + "|" + boolToStrNum(f & f) + "|" + boolToStrNum(f | f) + "|" + boolToStrNum(f ^ f) + "|" + boolToStrNum(!(f | f)) + "|");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    private static String boolToStrNum(boolean b) {
        if (b) {
            return "\u001B[32m\t1\t\u001B[0m";
        }

        return "\u001B[31m\t0\t\u001B[0m";
    }
}