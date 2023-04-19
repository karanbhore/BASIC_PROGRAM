package practise;

import java.util.Scanner;

public class StringReverse {

	public static String reverseScentence(String input) {

		if (input == null) {
			throw new IllegalArgumentException("Input required");
		}

		StringBuilder stringbuilder = new StringBuilder();
		String[] words = input.split("");
		for (int i = words.length - 1; i > 0; i--) {
			stringbuilder.append(words[i]);
			if (i != 0) {
				stringbuilder.append(" ");

			}
		}
		return stringbuilder.toString();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input");
		String input = sc.nextLine();
		System.out.println(reverseScentence(input));

	}

}
