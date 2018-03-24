package algorithms;



public class Helloworld {
	// loads Scanner definition for our use
	public static void main(String[] args) {
		int n = 5;
		try {
			n = Integer.parseInt(args[0]);
			if (n <= 0) {
				System.out.println("n must be positive. Using default.");
				n = 0;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No argument specified for n. Using default.");
		} catch (NumberFormatException e) {
			System.out.println("Invalid integer argument. Using default.");
		}
	}
}

