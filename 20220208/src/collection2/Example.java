package collection2;

public class Example {
	
	
	private int a;
	private int b;
	
	public Example()	{
		this.a = 1;
		this.b = 2;
		
		
	}
	
	// 특정 객체를 sysout으로 조회 시
	// 오버라이딩 된 toString()이 존재하면 주소값 대신
	// toString에서 리턴하는 문자열이 콘솔에 찍혀나옴
	@Override
	public String toString() {
		return "Example [a=" + a + ", b=" + b + "]";
	}
}
