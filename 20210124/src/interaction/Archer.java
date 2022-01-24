package interaction;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
	private String name;
	
	
	public Archer(String name) {
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		this.lv = 1;
		this.exp = 0;
		this.name = name;
	}
	public void huntOrc(Orc orc) {
		// orc의 체력을 검사해서 0 이하라면 공격 없이
		// 오크가 이미 죽은 상태입니다. 라는 멘트만 뜨고 
		// 메서드가 종료되게 해주세요.
		if(orc.getHp() <= 0) {// 교전 전에 이미 죽은 상태
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}
		
		
		orc.doBattle(this.atk);
		
		
		if(orc.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 10;
			System.out.println("오크를 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("아처의 경험치 : " + this.exp);
		}else {
			// 오크 공격력만큼 자신의 체력을 차감해줍니다.
			this.hp -= orc.getAtk();			
		}

		System.out.println("아처의 남은 체력 : " + this.hp);
	}
	public void huntSlime(Slime slime) {
		
		if(slime.getHp() <= 0) {
			System.out.println("슬라임이 이미 죽은 상태입니다.");
			return;
		}
		
		
		slime.doBattle(this.atk);
		
		
		if(slime.getHp() <= 0) {
			this.exp += 10;
			System.out.println("슬라임을 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("아처의 경험치 : " + this.exp);
		}else {
			
			this.hp -= slime.getAtk();			
		}

		System.out.println("슬라임의 남은 체력 : " + this.hp);
	}
	
public void huntTroll(Troll troll) {
		
		if(troll.getHp() <= 0) {
			System.out.println("트롤이 이미 죽은 상태입니다.");
			return;
		}
		
		
		troll.doBattle(this.atk);
		
		
		if(troll.getHp() <= 0) {
			this.exp += 10;
			System.out.println("트롤을 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("아처의 경험치 : " + this.exp);
		}else {
			
			this.hp -= troll.getAtk();			
		}

		System.out.println("트롤의 남은 체력 : " + this.hp);
	}
	
public void huntRabbit(Rabbit rabbit) {
	
	if(rabbit.getHp() <= 0) {
		System.out.println("토끼가 이미 죽은 상태입니다.");
		return;
	}
	
	
	rabbit.doBattle(this.atk);
	
	
	if(rabbit.getHp() <= 0) {
		this.exp += 10;
		System.out.println("토끼를 죽였습니다. 경험치가 2 올랐습니다.");
		System.out.println("아처의 경험치 : " + this.exp);
	}else {
		
		this.hp -= rabbit.getAtk();			
	}

	System.out.println("토끼의 남은 체력 : " + this.hp);
}
	
	// 타 몬스터쪽에서 전사 스탯을 조회할 수 있도록 Getter/Setter를 만들어주세요.
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

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	

}
