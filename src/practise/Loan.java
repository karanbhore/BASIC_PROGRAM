package practise;

public class Loan {
	public static void main(String[] args) {
		System.out.println("basic loan amount is :100 Rs");
		double i = inerestAmt(100);
		System.out.println("inerestAmt" + "  " + i);
		double t = totalAmt(i, 100);
		System.out.println("totalAmt" + "  " + t);
	}

	public static double inerestAmt(int l) {
		double result = 0;
		result = (12 * 100) / 100;
		return result;
	}

	public static double totalAmt(double i, int l) {
		double result = 0;
		result = i + l;
		return result;
	}

}
