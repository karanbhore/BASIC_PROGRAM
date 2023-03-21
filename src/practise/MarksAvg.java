package practise;

public class MarksAvg {
	public static void main(String[] args) {
		int x = totalMarks(70, 80, 90, 100, 60);
		avg(x);
	}

	public static int totalMarks(int s1, int s2, int s3, int s4, int s5) {
		int result = 0;
		result = s1 + s2 + s3 + s4 + s5;
		System.out.println("total marks");
		System.out.println(result);
		return result;

	}

	public static int avg(int totalMarks) {
		int result = 0;
		result = (totalMarks / 5);
		System.out.println("avg");
		System.out.println(result);
		return result;
	}

}
