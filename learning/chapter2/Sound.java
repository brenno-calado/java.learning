package chapter2;
class Sound {
	public static void main(String args[]) {
		float TIME = 7.2f;
		int FEET_PER_SECOND = 1100;

		float feet_distance = TIME * FEET_PER_SECOND;

		System.out.println("The lightning was at " + feet_distance + " feet away");
	}
}
