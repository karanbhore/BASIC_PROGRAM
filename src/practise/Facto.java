package practise;

public class Facto {

	public static void main(String[] args) {

		int n = 5;

//		for (int i = 5; i > 0; i--) {
//			facto *= i;
//		}
//		System.out.println(facto);

		factorial(n);

	}

	private static void factorial(int n) {

		int facto = 1;
		for (int i = 5; i > 0; i--) {
			facto *= i;
		}
		System.out.println(facto);

	}
}
