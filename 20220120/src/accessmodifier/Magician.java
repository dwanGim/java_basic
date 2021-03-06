package accessmodifier;

public class Magician extends Commoner{

	// 생성자를 만들어주세요.
	// Magician 측에서 설정하는 변수는 추가로 없지만
	// 생성자는 상속되지 않으므로 부모쪽 생성자를
	// 처리할 수 있도록 만들어주세요.
	
	public Magician(String name) {
		super(name);
		
		
	}
	// 사냥 메서드를 만들겠습니다.
	public void hunt()	{
		System.out.println("마법사가 사냥을 시작합니다.");
		//hp -= 2; private 요소는 자식 쪽에서도 컨트롤 불가능.
		// public인 setter의 일종인 setHp()를 대신 활용합니다.
		// setHp(5)인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청입니다.
		// 현재 원하는 것은 hp값에서 2가 깎인 값이 새로운 hp로 저장되는 것입니다.
		// setter와 getter(setHP(), getHp()를 적절히 활용해
		// 전투할 때마다 체력이 2씩 깎이도록 로직을 작성해주세요.
		setHp(getHp()-2);
		// 경험치도 마찬가지로
		// exp += 10;을 직접 실행할 수 없으므로 세터게터 활용
		setExp(getExp()+10);
	}
	
	public void getInfo() {
		// 심지어 private요소는 조회도 불가능합니다.
		// 따라서 getter를 이용해서 상태를 조회할 수 있게 해주세요.
		System.out.println(getName()+" 마법사의 정보입니다.");
		System.out.println("hp : "+getHp()+", mp : "+getMp()
		+", exp : "+getExp());
	}
	
	public void fireball() {
		setMp(getMp()-3);
		setExp(getExp()+20);
		System.out.println("파이어볼!");
	}
	
}
