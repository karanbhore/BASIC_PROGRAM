package practise;

import java.util.Arrays;

public class LargestElementSearch {

	public static void main(String[] args) {

		int[] num = { 25, 12, 78, 55, 45, 65, 100 };

		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println();
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
		}
		System.out.println();
		System.out.println(num[num.length - 1] + " is the largest element");

	}
}
