package practise;

import java.util.Scanner;

public class ScannerInputs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("give input numbers");

		System.out.println("input first num");
		int n1 = sc.nextInt();

		System.out.println("input second num");
		int n2 = sc.nextInt();

		System.out.println("input third num");
		int n3 = sc.nextInt();

		System.out.println("input fourth num");
		int n4 = sc.nextInt();

		System.out.println("now check equality");
		System.out.println();
		if (n1 == n2 && n2 == n3 && n3 == n4 ) {
			System.out.println("All nums are equals "+n1);
		} else
			System.out.println("nums are diffrent");

	}

}
