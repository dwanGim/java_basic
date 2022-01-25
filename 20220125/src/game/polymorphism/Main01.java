package game.polymorphism;

public class Main01 {
	public static void main(String[] args) {
		// Warrior 하나, Orc 하나를 생성해주세요.
		
		
		Warrior w1 = new Warrior("김삿갓");
		Orc o1 = new Orc();
		Tauren t1 = new Tauren();
		TaurenChieftain tc1 = new TaurenChieftain();
		
		w1.hunt(o1);
		w1.hunt(o1);
		w1.hunt(o1);
		
		w1.hunt(t1);
		w1.hunt(t1);
		w1.hunt(t1);
		
		w1.hunt(tc1);
		w1.hunt(tc1);
		w1.hunt(tc1);
	}
}
