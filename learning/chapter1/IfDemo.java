package chapter1;
// Demonstração de instrução if

class IfDemo {
	public static void main(String args[]) {
		int a = 2, b = 3, c;

		if(a < b) System.out.println("a is less than b");
		if(a == b) System.out.println("a is equal to b. So this message won't show up");

		System.out.println();

		c = a - b;

		System.out.println("c contains -1");
		if(c >= 0) System.out.println("c is non-negative");
		if(c < 0) System.out.println("c is negative");

		System.out.println();

		c = b - a;

		System.out.println("c contains 1");
		if(c >= 0) System.out.println("c is non-negative");
		if(c < 0) System.out.println("c is negative");
	}
}
