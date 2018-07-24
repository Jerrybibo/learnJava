package exercise;
//循环
public class loops {
	public static void main(String[]args) {
		fors();
//		whiles();
		
	}
	private static void fors() {
		int len = 5;
		String s = " ";
		for(int i=0;i<len;i++) {
			for(int j=0;j<len; j++) {
				s+=" ";
				System.out.println(s+i);
			}
		}
	}
	private static void whiles() {
		int a = 0;
		while(a<10){
			System.out.println(a);
			a++;
		}
		System.out.print(a);
	}
}
