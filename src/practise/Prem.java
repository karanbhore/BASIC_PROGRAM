package practise;

public class Prem {
	public static void main(String[] args) {
		try {
			int n=10/0;
		}
		catch( ArithmeticException e) {
			System.out.println(e.toString());
		}
		
		
		System.out.println("Hello");
	}

}
