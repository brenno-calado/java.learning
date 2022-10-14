// Diferença entre int e double

class Example3 {
	public static void main(String args[]) {
		int var;
		double x;

		var = 10;
		x = 10.0;

		System.out.println("Original value of var is " + var);
		System.out.println("Original value of x is " + x + "\n");

		var /= 4;
		x /= 4;

		System.out.println("var after division is " + var);
		System.out.println("x after division is " + x);
	}
}
