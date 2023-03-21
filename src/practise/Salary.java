package practise;

public class Salary {
	public static void main(String[] args) {
		int b = 1000;
		double h = hra(1000);
		System.out.println("HRA" + "  " + h);
		double t = ta(1000);
		System.out.println("TA" + "  " + t);
		double d = da(1000);
		System.out.println("DA" + "  " + d);
		double a = add(h, t, d, b);
		System.out.println("basic pay" + "  " + a);
		double m = ma(a);
		System.out.println("MA" + "  " + m);
		double p = pf(a);
		System.out.println("PF" + "  " + p);
		double n = netSalary(a, m, p);
		System.out.println("the Net salary" + "  " + n);
	}

	public static double hra(int b) {
		double result = 0;
		result = (45 * b) / 100;
		return result;
	}

	public static double ta(int b) {
		double result = 0;
		result = (25 * b) / 100;
		return result;
	}

	public static double da(int b) {
		double result = 0;
		result = (30 * b) / 100;
		return result;
	}

	public static double add(double h, double t, double d, int b) {
		double result = 0;
		result = h + t + d + b;
		return result;
	}

	public static double ma(double a) {
		double result = 0;
		result = (5 * a) / 100;
		return result;
	}

	public static double pf(double a) {
		double result = 0;
		result = (25 * a) / 100;
		return result;
	}

	public static double netSalary(double a, double m, double p) {
		double result = 0;
		result = (a - m) - p;
		return result;
	}

}
