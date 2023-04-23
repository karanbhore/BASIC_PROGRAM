package practise;

import java.util.Scanner;

public class Convertor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("input temp degree celcious");

		System.out.println();

		double t = sc.nextDouble();



		System.out.println("temp in farenheight");
		System.out.println();

		double f = (t * 9 / 5) + 32;
		System.out.println(f);

	}
}
