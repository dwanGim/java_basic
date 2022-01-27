package interface1;

// 인터페이스는 interface 선언을 사용합니다.
// 내부에는 상수인 값과 추상메서드만 선언할 수 있습니다.
// 애초에 구현(implements)를 전제로 설계되기 때문에
// 일반 변수, 메서드를 내부에 선언할 수 없습니다.
// 다형성에서는 인터페이스도 부모클래스처럼 하위 클래스를 대입받을 수 있습니다.
public interface Vehicle {
	// 1. 상수없이 사용
	// 2. 자동차의 최대 연료량을 선언해보겠습니다.
	int MAX_GAS = 70;
	int MAX_SPEED = 200;
	int INCREASE_SPEED = 10;
	int DECREASE_SPEED = 10;
	int REFUEL_GAS = 30;
	int MINIMUM_SPEED = 0;
	int FUEL_EFFICIENCY = 1;
	
	int T_MAX_GAS = 3500;
	int T_MAX_SPEED = 400;
	int T_INCREASE_SPEED = 100;
	int T_DECREASE_SPEED = 50;
	int T_REFUEL_GAS = 700;
	int T_FUEL_EFFICIENCY = 30;
	// 3. 자동차에 이어 기차를 만들어보세요.
	// Train 클래스로 만들고 Vehicle을 구현합니다.
	// 최대속도 400, 충전은 700씩, 소모는 30씩, 증가속도 100, 감속 50
	// 탈 것이라면 보편적으로 가지는 공통적 기능을 전부 추상메서드로 작성
	// {
	//		실행문 ...
	//  }
	// 와 같은 실행은 부분(메서드의 몸체, body라고도 부름) 없이 선언만 해주세요.
	public void accel();	// 가속
	public void breakSpeed(); // 감속
	public void reFuel();	// 주유
	public void showStatus();	// 계기판
	
}
