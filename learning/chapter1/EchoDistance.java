package chapter1;
class EchoDistance {
	public static void main(String args[]) {
		double ECHO_SECONDS = 2;
		final int SOUND_FEET_PER_SECOND = 1100;

		double distance = (SOUND_FEET_PER_SECOND * ECHO_SECONDS) / 2;

		System.out.println("The Object is at " + distance + " feet away.");
	}
}
