class GalToLitTable {
	public static void main(String args[]) {
		final double GAL_TO_LIT = 3.7854;
		System.out.println("Gallons | Liters");

		int counter = 0;
		for(double gallons = 1; gallons <= 100; gallons++) {
			counter++;
			System.out.println(gallons + " | " + gallons * GAL_TO_LIT);

			if(counter == 10) {
				counter = 0;
				System.out.println();
			}
		}
	}
}
