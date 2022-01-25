package game.polymorphism;

public class Warrior {
	// 속성(필드, 변수)값으로 name, hp, mp, atk를 추가해주세요.
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	
	// 생성자로 설정한 필드들을 초기화해주세요.
	// hp 20, mp 10, atk 4로 고정값을 넣습니다.
	// name은 사용자에게 입력받습니다.
	public Warrior (String name)	{
		this.name = name;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.exp = 0;
	}

	// hunt()를 만들어주세요.
	// Monster 타입과 교전이 가능합니다.
	// Monster의 doBattle()을 호출해 자기 데미지를 몬스터에게 넘겨주고
	// 몬스터가 살아있다면 다시 몬스터의 공격력만큼 데미지를 받습니다.
	// 몬스터가 공격 전에 죽어있다면 죽은 몬스터를 공격할 수 없습니다.
	// 몬스터를 죽였다면 표시해주세요.
	public void hunt(Monster monster)	{
		if (monster.getHp() <= 0)	{
			System.out.println("해당 " + monster.getName()+" 체력이 0 이하, 교전이 불가능해요.");
			return;
		} 
		System.out.println("---- 사냥 시작 ----");
		monster.doBattle(this.atk);
		
		if (monster.getHp() <= 0){
			System.out.println(monster.getName()+"이/가 쓰러졌습니다!");
			System.out.println("경험치 "+monster.getExp()+" 획득!");
			
		}
		else {
			this.hp -= monster.getAtk();	
			System.out.println(this.name+"은 "+monster.getName()+"에게 "+monster.getAtk()+" 만큼 피해를 입었다.");
			System.out.println("남은 적의 체력 : "+monster.getHp());
			
		}
		
		System.out.println(this.name+ "의 남은 체력 : "+this.hp);
	}
	
	public void getInfo()	{
		System.out.println(this.name+"의 정보입니다.");
		System.out.println("체력 : "+this.hp+" / 마나 : "+this.mp+" / 공격력 : "+this.atk
				+" / 경험치 : "+this.exp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
