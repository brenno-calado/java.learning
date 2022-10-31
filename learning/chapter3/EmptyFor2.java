package chapter3;

class EmptyFor2 {
    public static void main(String[] args) {
        int i = 1, sum = 0;

        for (i = 1; i <= 5; sum += i++) ;

        System.out.println("Sum is " + sum);
    }
}