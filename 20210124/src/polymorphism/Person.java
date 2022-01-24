package polymorphism;

public class Person {
	// 사람을 나타내는 클래스
	// 상속만을 목적으로 하는 클래스
	// Person을 상속받은 자식들은 전부
	// Person을 요구하는 자리에 대입할 수 있습니다.
	
	private String name;
	private int age;
	
	// 이름과 나이를 받아 초기화해주세요.
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Person의 전체 데이터를 콘솔에 찍어주는 showPerson()
	public void showPerson()	{
		System.out.println(name + "의 정보입니다.");
		System.out.println("나이 : " + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
