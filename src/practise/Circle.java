package practise;

public class Circle {
	public static void main(String[] args) {
		double a=area(4);
		System.out.println("area"+"    "+a);
		double c=circumference(4);
		System.out.println("circumference"+"  "+c);
		
	}
	public static double area(int r) {
		double result=0;
		result=Math.PI*r*r;
		System.out.println(result);
		return result;
		
	}
	public static double circumference(int r) {
		double result=0;
		result=2*Math.PI*r;
		System.out.println(result);
		return result;
	}

}
