package practise;

public class TwoDimensionalArray3 {

	public static void main(String[] args) {

		int[][] num = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		int[][] newNum = new int[num[0].length][num.length];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				newNum[j][i] = num[i][j];

			}
		}

		for (int i = 0; i < newNum.length; i++) {
			for (int j = 0; j < newNum[0].length; j++) {
				System.out.print(newNum[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
