package practise;

public class Triangle {
	public static void main(String[] args) {
		double a = area(10, 10, 20);
		System.out.println("area" + "   " + a);

	}

	public static double area(int l, int b, int h) {
		double result = 0;
		result =( l * b * h)/2;
		return result;

	}

}
