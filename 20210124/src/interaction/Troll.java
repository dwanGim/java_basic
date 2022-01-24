package interaction;

public class Troll {
	private int hp;
	private int atk;
	
	
	public Troll() {
		this.hp = 10;
		this.atk = 4;
	}
	
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("트롤의 남은 체력 : " + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	
}
