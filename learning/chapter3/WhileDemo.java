package chapter3;
class WhileDemo {
    public static void main(String[] args) {
        char ch = 'a';

        while (ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}