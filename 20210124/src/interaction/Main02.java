package interaction;

public class Main02 {
	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		Orc o1 = new Orc();
		Slime s1 = new Slime();
		Troll t1 = new Troll();
		
		w1.huntOrc(o1);
		w1.huntSlime(s1);
		w1.huntTroll(t1);
		
	}
}
