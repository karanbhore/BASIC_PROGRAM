package practise;

import java.util.Arrays;

public class ArraySortwithoutUsingInbuiltMethod {

	public static void main(String[] args) {

		int[] num = { 5, 4, 8, 9, 4, 2, 3, 6, 7 };
		for (int i = 0; i < num.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[minIndex]) {
					minIndex = j;
				}

			}
			int temp = num[minIndex];
			num[minIndex] = num[i];
			num[i] = temp;

		}
		System.out.println(Arrays.toString(num));
	}

}