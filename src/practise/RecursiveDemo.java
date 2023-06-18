package practise;

public class RecursiveDemo {

	public static int facto(int n) {

		if (n != 0) {
			return n * facto(n - 1);

		} else
			return 1;

	}

	public static void main(String[] args) {
		int res = facto(5);
		System.out.println(res);

	}
}
