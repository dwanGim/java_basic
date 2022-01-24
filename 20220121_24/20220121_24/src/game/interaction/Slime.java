
public class Slime {
	public class Slime {
		// 오크는 hp, atk 을 가집니다.
		private int hp;
		private int atk;
		
		// 생성자는 오크에게 hp는 5, atk는 3을 부여합니다.
		public Silme() {
			this.hp = 10;
			this.atk = 1;
		}
		
		// doBattle() 메서드를 만들겠습니다.
		// 유저의 공격력(uAtk)을 입력받아 오크의 체력을 차감합니다.
		public void doBattle(int uAtk) {
			this.hp -= uAtk;
			System.out.println("슬라임의 남은 체력 : " + this.hp);
		}
}
