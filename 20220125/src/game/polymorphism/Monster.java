package game.polymorphism;

public class Monster {
	// hp, atk를 변수(필드, 속성)을 가집니다.
	private int hp;
	private int atk;
	private String name;
	private int exp;
	
	// 생성자까지 만들어주세요.
	public Monster (int hp, int atk, String name, int exp)	{
		this.hp = hp;
		this.atk = atk;
		this.name = name;
		this.exp = exp;
	}
	
	// doBattle(int)를 생성해주세요.
	// 사용자의 공격력 uAtk만큼 Monster의 체력이 깎입니다.
	// 체력이 0이 되면 해당 몬스터와 교전이 불가능하다는 메세지를 남겨줍니다.
	// 체력이 0보다 높으면 남은 채력을 마지막에 콘솔창에 띄워줍니다.
	
	public void doBattle(int uAtk)	{
		this.hp -= uAtk;
		System.out.println(this.name+"에게 "+uAtk+"만큼 공격");
		System.out.println("남은 적의 체력 : "+this.hp);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
}
