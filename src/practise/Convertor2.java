package practise;

import java.util.Scanner;

public class Convertor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("type");

		char op = sc.next().charAt(0);

		System.out.println(op);

		switch (op) {

		case 'a':

			System.out.println("hello");
			break;

		case 'b':
			System.out.println("hi");
			break;
		default:
			System.out.println("*");
			break;
		}

	}

}
