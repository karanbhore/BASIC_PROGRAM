package practise;

public class Swap {
	public static void main(String[] args) {
		int a = 1000, b = 500;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

}
