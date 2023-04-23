package practise;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first num");
		double n1 = sc.nextDouble();

		System.out.println("enter second num");
		double n2 = sc.nextDouble();

		System.out.println("select operation *   -   /   + ");
		char op = sc.next().charAt(0);

		double result = 0;

		switch (op) {
		case '+':
			result = n1 + n2;
			break;

		case '-':
			result = n1 - n2;
			break;

		case '*':
			result = n1 * n2;
			break;

		case '/':
			result = n1 / n2;
			break;

		default:
			System.out.println("invalid operation");
			break;

		}
		System.out.println(result);

	}
}
