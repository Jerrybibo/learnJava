package exercise;
//判断
public class ifs {
	public static void main(String[] args) {
//			useIf();
			useSwitch(1);
	}
	private static void useIf() {
		int a=2;
		if(a>15) {
			System.out.println("大于10");
		}else if(a>10) {
			System.out.println("大于15");
		}else {
			System.out.println("小于");
		}
	}
	private static void useSwitch(int nmu) {
		switch(nmu) {
		case 10:
			System.out.println("数字是10");
			break;
		case 11:
			System.out.println("数字是11，可以用");
			break;
		default:
			System.out.println("this is default func ,the num is "+nmu);
			break;
		}
	}
}
