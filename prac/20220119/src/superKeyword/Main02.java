package superKeyword;

public class Main02 {
	
	public static void main(String[] args) {
		// 초음속 비행기를 만들겠습니다. 초기속도 300
		SupersonicAirplane a1 = new SupersonicAirplane(300);
		// 비행을 2번 하게 해보세요.
		a1.fly();
		a1.fly();
		a1.breakSpeed();
		
		
	}
}
