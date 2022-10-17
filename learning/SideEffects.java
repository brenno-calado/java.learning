class SideEffects {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("i starts with " + i);
        if (i != 0 & (++i < 2)) System.out.println("this won't be displayed");

        System.out.println("i is now " + i);

        if (i == 0 && (++i < 2)) System.out.println("this won't be displayed");

        System.out.println("i is now " + i);
    }
}