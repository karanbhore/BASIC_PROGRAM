package practise;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("lets calculate facto of 5");
		int num = 5;
		int factorial = 1;

		for (int i = num; i >0; i--) {
			factorial = factorial * i;
		}
		System.out.println("factorial of 5 " + factorial);

	}
}
