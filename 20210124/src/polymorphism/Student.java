package polymorphism;

	// 부모클래스를 Person으로 가지도록 상속해주세요.
public class Student extends Person	{
	
	// 학생의 등급인 grade(성적) 변수를 선언합니다.
	private int grade;
	// super()를 이용해 Person(부모) 생성자까지 커버하는 생성자를 만들어주세요.
	// name, age, grade까지 모두 입력받습니다.
	// 부모 쪽에서 쓸 자원인 name, age는 부모 쪽으로 넘겨준 다음
	// grade인 자신이 받아서 씁니다.
	
	public Student (String name, int age, int grade)	{
		super(name, age);
		this.grade = grade;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("성적은 : "+this.grade);
		
	}
	
	public void showStudent()	{
		System.out.println("저는 학생입니다.");
		
	}
	
}
