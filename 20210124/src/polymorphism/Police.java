package polymorphism;

public class Police extends Person {
	private String Classes;
	
	public Police (String name, int age, String Classes)	{
		super(name, age);
		this.Classes = Classes;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("계급은 : "+this.Classes);
		
	}
	
	public void showPolice()	{
		System.out.println("저는 경찰입니다.");
		
	}
}
