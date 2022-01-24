package accessmodifier;

public class Main01 {
	
	public static void main(String[] args) {
		// Magician을 하나 생성해주세요.
		Magician user1 = new Magician("해리포터");
		// getInfo()로 정보를 조회해주세요.
		user1.getInfo();
		// hunt()를 2번 호출해 사냥 2번
		user1.hunt();
		user1.hunt();
		user1.fireball();
		
		user1.getInfo();
		// commoner를 상속한 워리어클래스를 만들자
		// 전사는 hunt할 경우 체력 -1 경험치 +10
		// doubleAttack을 스킬도 만들자
		// 체력 -4 경험치 +25
		// getInfo()도 만들자
	}
}
