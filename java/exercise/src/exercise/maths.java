package exercise;
//math 数学类
public class maths {
	public static void main(String[] args) {
		double a = 2.15252;
		int b  = -2254;
		System.out.println((int)ciles(a));
		System.out.println(floors(a));
		System.out.println(Math.abs(b));
//		math.
	}
	//向上取整
	private static double  ciles(double a) {

		return Math.ceil(a);
	}
	//向下取整
	private static double floors(double a) {
		return Math.floor(a);
	}
}
