package casting;

public class Cat extends Animal{

	public Cat (String name, int age)	{
		super(name, age);
	}
	
	public void haaak()	{
		System.out.println("고양이가 하악거립니다.");
		
	}
	
	public void sit()	{
		System.out.println("고양이가 앉습니다.");
	}
}
