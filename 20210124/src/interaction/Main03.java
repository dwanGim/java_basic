package interaction;

public class Main03 {
	public static void main(String[] args) {
		
		Archer a1 = new Archer("아처");
		Magician m1 = new Magician("법사");
		Orc o1 = new Orc();
		Slime s1 = new Slime();
		
		a1.huntOrc(o1);
		a1.huntOrc(o1);
		m1.huntSlime(s1);
		m1.huntSlime(s1);
		
	}
}
