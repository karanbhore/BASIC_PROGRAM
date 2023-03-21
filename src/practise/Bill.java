package practise;

public class Bill {
	public static void main(String[] args) {
		double g = gstAmt(100);
		System.out.println("gstAmt" + "   " + g);
		double t = totalAmt(g, 100);
		System.out.println("totalAmt" + "  " + t);
	}

	public static double gstAmt(int b) {
		double result = 0;
		result = (18 * b) / 100;
		return result;

	}

	public static double totalAmt(double g, int b) {
		double result = 0;
		result = g + b;
		return result;

	}

}
