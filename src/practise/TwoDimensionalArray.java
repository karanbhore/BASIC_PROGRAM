package practise;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		boolean[][] arr = { { true, false, true }, { false, true, false } };

		int rows_length = arr.length;
		int coloumns_lentgh = arr[0].length;

		for (int i = 0; i < rows_length; i++) {
			for (int j = 0; j < coloumns_lentgh; j++) {
				if (arr[i][j]) {
					System.out.print(" t ");
				} else {
					System.out.print(" f ");
				}
			}
			System.out.println();
		}

	}
}
