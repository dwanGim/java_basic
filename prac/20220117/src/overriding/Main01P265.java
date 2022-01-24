package overriding;

public class Main01P265 {
	public static void main(String[] args) {
		Horse h1 = new Horse();
		h1.name = "철룡이";
		h1.age = 3;
		h1.gender = "수컷";
		h1.rank = 10;
		
		h1.getInfo();
		h1.howl();
	
		Cat c1 = new Cat();
		c1.name = "nabi";
		c1.age = 1;
		c1.gender = "unknown";
		c1.color = "chaotic";
		
		c1.howl();
		c1.getInfo();
	
	}
	
	
	
}
