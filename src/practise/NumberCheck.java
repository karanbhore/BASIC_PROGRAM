package practise;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("input first number");
		int n1 = sc.nextInt();

		System.out.println("input secondnumber");
		int n2 = sc.nextInt();

		System.out.println("input third number");
		int n3 = sc.nextInt();

		System.out.println("input fourth number");
		int n4 = sc.nextInt();

		System.out.println();

		if (n1 == n2 && n2 == n3 && n1 == n3) {
			System.out.println("all numbers ae equals :"+ n1 + "," + n2 + "," + n3 + "," + n4);
		} else {

			System.out.println("numbers are diffrent :" + n1 + "," + n2 + "," + n3 + "," + n4);
		}

	}
}
