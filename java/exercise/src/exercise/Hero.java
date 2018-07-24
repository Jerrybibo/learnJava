package exercise;

public class Hero extends Bases{
	public String name;
	protected float hp;
	public Hero() {
		System.out.println("childer");
	}
	public static void main(String[] args) {
		Bases b = new Hero();
		System.out.println(b.name);
	}
}
