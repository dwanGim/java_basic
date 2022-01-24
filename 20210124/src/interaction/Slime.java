package interaction;

public class Slime {
	private int hp;
	private int atk;
	
	
	public Slime() {
		this.hp = 8;
		this.atk = 1;
	}
	
	
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("슬라임의 남은 체력 : " + this.hp);
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
