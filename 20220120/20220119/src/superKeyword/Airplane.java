package superKeyword;

public class Airplane {
	// 비행기는 속도를 가집니다.;
	protected int speed;
	// 생성자는 속도를 입력받아 저장해줍니다.
	public Airplane(int speed)	{
		this.speed = speed;
	}
	
	// fly()메서드를 정의하는데 속도가 500씩 붙습니다.
	// 단, 일반 비행기는 속도가 900 초과일 수 없습니다.
	public void fly()	{
		if ((this.speed+500)>900) {
			this.speed = 900;
		} else {
			this.speed += 500;
		}
		System.out.println("현재 비행기는 시속 " + speed + "km/h로 비행 중.");
	}
	// breakSpeed() 메서드를 수행하면 속도가 100씩 감소합니다.
	// 단 브레이크 구동의 최저 속도는 0
	public void breakSpeed()	{
		if ((this.speed-100)<0)	{
			speed=0;
		}	else {
			speed -= 100;
		}
		System.out.println("현재 비행기는 시속 "+speed+"km/h로 비행 중.");
	}
}
