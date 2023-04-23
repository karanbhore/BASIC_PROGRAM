package practise;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		boolean res = false;

		System.out.println("give your inputs");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.println(" first input");
		double n1 = sc.nextDouble();

		System.out.println("second input");
		double n2 = sc.nextDouble();

		System.out.println();
		
		if ((n1 < 1 && n1 > 0) && (n2 < 1 && n2 > 0)) {
			System.out.println("both nums in between 0 & 1");
		} else

			System.out.println(res);

	}
}
