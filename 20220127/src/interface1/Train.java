package interface1;

public class Train implements Vehicle {
	
	private String name;
	private int speed;
	private int gas;

	// Train 클래스로 만들고 Vehicle을 구현합니다.
	// 최대속도 400, 충전은 700씩, 소모는 30씩, 증가속도 100, 감속 시 50
	public Train (String name)	{
		this.name = name;
		this.speed = MINIMUM_SPEED;
		this.gas = T_MAX_GAS;
		
	}
	
	@Override
	public void accel() {
		if (this.speed + T_INCREASE_SPEED >= T_MAX_SPEED) {
			this.speed = T_MAX_SPEED;
		} else {
			this.speed += T_INCREASE_SPEED;
			}
			this.gas -= T_FUEL_EFFICIENCY;
	}
		
		
	

	@Override
	public void breakSpeed() {
		if (this.speed - T_DECREASE_SPEED <= MINIMUM_SPEED) {
			this.speed = MINIMUM_SPEED;
			} else {
				this.speed -= T_DECREASE_SPEED;
			}
	
	}

	@Override
	public void reFuel() {
		if (this.gas + T_REFUEL_GAS >= T_MAX_GAS) {
		this.gas = T_MAX_GAS;
		
		} else {
		this.gas += T_REFUEL_GAS;
	}
	}

	@Override
	public void showStatus() {
		System.out.println(this.name + "의 기차입니다.");
		System.out.println("현재 속도 : " + this.speed + ", 연료량 : " + this.gas);
		
	}


}
