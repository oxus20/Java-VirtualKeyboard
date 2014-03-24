public class ExceptionHandlingDemo {
	public static void main(String args[]) {
		try {
			int scores[] = { 90, 85, 75, 100 };
			System.out.println("Access element four:" + scores[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown:" + e);
		}
		System.out.println("Out of the block");
	}
}
