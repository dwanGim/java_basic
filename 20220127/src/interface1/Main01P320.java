package interface1;

public class Main01P320 {

	public static void main(String[] args) {
		// 인터페이스의 경우는 부모 쪽에 맴버변수가 따로 없고
		// 모든 메서드를 다 오버라이딩 해야하기 때문에
		// 부모타입에서 자식 쪽의 기능을 실행하려 할 때
		// 기본적으로 부모 쪽에서 정의한 내용을 실행하는데 제약이 없습니다.
		
		// 다형성 원리는 알고 계신대로 적용됩니다.
		Vehicle c1 = new Car("채종훈");
		c1.accel();
		c1.accel();
		c1.showStatus();
		c1.breakSpeed();
		c1.breakSpeed();
		c1.showStatus();
		c1.reFuel();
		c1.showStatus();
	}

}
