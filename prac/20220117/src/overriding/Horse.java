package overriding;

// Animal을 상속받게 해주세요.
public class Horse extends Animal {
	public int rank;
	
	// 오버라이딩 요건
	// 이름과 리턴자료형 등이
	// 같은 부모쪽 메서드를
	// 자식 쪽에서 다시 중복해서 작성함
	public void howl()	{
		System.out.println("힣후힣ㅎ후힣히후");
	}
	
	public void getInfo()	{
		System.out.println("이름은 "+name+", 나이는 "+age+", 성별은 "
				+gender+ ", 순위는 "+rank);
	}
}
