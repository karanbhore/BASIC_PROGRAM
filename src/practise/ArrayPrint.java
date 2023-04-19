package practise;

public class ArrayPrint {

	public static void main(String[] args) {

		int[][] twodm = { { 10, 20, 30 }, { 40, 50, 60 } };

		System.out.println("original array :\n");
		print_array(twodm);

		System.out.println("after changing the rows and columns of array");
		transpose(twodm);

	}

	private static void transpose(int[][] twodm) {

		int[][] newtwodm = new int[twodm[0].length][twodm.length];

		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				newtwodm[j][i] = twodm[i][j];
			}
		}

		print_array(newtwodm);

	}

	private static void print_array(int[][] twodm) {
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; i++) {
				System.out.println(twodm[i][j] + " ");

			}
			System.out.println();
		}

	}
}
