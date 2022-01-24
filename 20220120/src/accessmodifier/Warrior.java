package accessmodifier;

public class Warrior extends Commoner{
	
	public Warrior (String name) {
		super(name);
	}
	public void hunt() {
		setHp(getHp()-1);
		setExp(getExp()+10);
		System.out.println("사냥을 합니다.");
	}
	public void doubleAttack()	{
		setHp(getHp()-4);
		setExp(getExp()+25);
		System.out.println("더블어택!");
	}
	public void getInfo() {
		
		System.out.println(getName()+" 전사의 정보입니다.");
		System.out.println("hp : "+getHp()+", mp : "+getMp()
		+", exp : "+getExp());
	}
}
