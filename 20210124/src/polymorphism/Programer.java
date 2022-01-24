package polymorphism;

public class Programer extends Person {
	private String major;
	
	public Programer (String name, int age, String major)	{
		super(name, age);
		this.major = major;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("전공은 : "+this.major);
		
	}
	
	public void showProgramer()	{
		System.out.println("저는 프로그래머입니다.");
		
	}

}
