package practise;

import java.util.Scanner;

public class NumberCheck2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("input first number");
		double d1 = sc.nextDouble();

		System.out.println("input second number");
		double d2 = sc.nextDouble();

		System.out.println(d1 > 0 && d1 < 1 && d2 > 0 && d2 < 1);

	}

}
