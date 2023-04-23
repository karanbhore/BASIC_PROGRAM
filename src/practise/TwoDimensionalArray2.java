package practise;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
		boolean[][] arr = { { true, false, true }, { false, true, false } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == true) {
					System.out.println("t");
				} else
					System.out.println("f");
			}
		}

//	int[][] num= {{1,2,3,4},{1,2,3,4}};

	}

}
