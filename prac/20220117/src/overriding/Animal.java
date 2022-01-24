package overriding;

public class Animal {
	// 모든 동물이 공통으로 가지는 특성을 정의.
	public String gender;
	public String name;
	public int age;
	
	public void howl() {
		System.out.println("동물이 울부짖었다.");
	}
	
	public void getInfo() {
		System.out.println("이름은 "+name+", 나이는 "+age+", 성별은 "
				+gender);
	}
}
