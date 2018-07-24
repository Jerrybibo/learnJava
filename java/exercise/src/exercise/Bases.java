package exercise;

public class Bases {
	public String name;
	//构造方法
	public  Bases() {
		this.name = "testname";
		System.out.println("test name");
	}
	public static void main(String[] args) {
		Bases b = new Bases();
		System.out.println(b.name);
	}

	
}
