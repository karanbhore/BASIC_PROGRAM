package practise;

public class LogarithmicCheck {

	public static void main(String[] args) {

		int n = 2350;
		System.out.println("original number : %\n" + n);

		int shift_right_count = 0;

		do {
			n >>= 1;
			shift_right_count++;
		} while (n != 0);

		shift_right_count--;
		System.out.println("Result : %\n" + shift_right_count);

	}
}
