package practise;

import java.util.Arrays;

public class ArraySortInDescendingOrder {

	public static void main(String[] args) {

		int[] num = { 154, 50, 78, 25, 63, 45 };

		for (int i = 0; i < num.length; i++) {
			int largestIndex = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] > num[largestIndex]) {
					largestIndex = j;
				}

			}
			int temp = num[largestIndex];
			num[largestIndex] = num[i];
			num[i] = temp;

		}
		System.out.println(Arrays.toString(num));

	}
}
