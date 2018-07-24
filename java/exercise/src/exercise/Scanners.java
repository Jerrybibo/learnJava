package exercise;
import java.util.Scanner;
public class Scanners {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(setnum(a));
	}
	private static String setnum(int num) {
		String i;
		i = (num%2>0)?"奇数":"偶数";
		return i;
//		if(num%2>0) {
//			 i = "奇数";
//		}else {
//			 i = "偶数";
//		}
//		return i;
		
	}
}
