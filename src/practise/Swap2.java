package practise;

public class Swap2 {
	public static void main(String[] args) {
		int x = 100, y = 500;
		System.out.println("values before swap" + " x =" + x);
		System.out.println("values before swap" + " y= " + y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("values after swap" + " x= " + x);
		System.out.println("values after swap" + " y= " + y);

	}

}
