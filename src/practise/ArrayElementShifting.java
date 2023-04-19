package practise;

import java.util.Arrays;

public class ArrayElementShifting {

	public static int[] splitSortingArray(int[] arr) {


		boolean flag = true;
		while (flag) {
			flag = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					flag = true;
				}

			}

		}
		return arr;

	}

	private static void swap(int[] arr, int right, int left) {

		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;

	}

	public static void main(String[] args) {

		int[] arr = { -2, 3, 4, -1, -3, 1, 2, -4, 0 };

		System.out.println(Arrays.toString(arr));

		int[] res = splitSortingArray(arr);
		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));


	}
}
