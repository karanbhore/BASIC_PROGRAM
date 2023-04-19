package practise;

import java.util.Arrays;

public class ArraysElementSwapping {

	public static void main(String[] args) {
		int[] num = { 0, 3, 4, 0, 1, 2, 5, 0 };
		System.out.println(Arrays.toString(num) + "\n this is given array");

		int[] res = moveZero(num);

		System.out.println(Arrays.toString(res));

	}

	private static int[] moveZero(int[] num) {

		boolean flag = true;
		while (flag) {
			flag=false;
			for (int i = 0; i < num.length - 1; i++) {
				if ((num[i] == 0) && num[i + 1] != 0) {
					swap(num, i, i + 1);
					flag = true;
				}
			}

		}

		return num;
	}

	private static void swap(int[] num, int i, int j) {

		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;

	}

}
