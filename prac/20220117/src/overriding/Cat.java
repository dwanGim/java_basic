package overriding;

public class Cat extends Animal {

	public String color;
	
	public void howl()	{
		System.out.println("miyao");
	}
	public void getInfo()	{
		System.out.println("이름은 "+name+", 나이는 "+age+", 성별은 "
				+gender+ ", 색깔은  "+color);
	}
}
