package inheritance;

public class Mani01P254 {
	public static void main(String[] args) {
		// Student가 Person을 상속했기 때문에
		// Student는 Person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		s1.stuNum = 16022876;
		
		s1.getInfo();
		s1.getStuInfo();
		
		//Student를 하나 더 만들고 그림으로 그려서 캡쳐해서 보내주세요.
		Student s2 = new Student();
		s2.name = "임꺽정";
		s2.age = 40;
		s2.stuNum = 33954101;
		
		s2.getInfo()	;
		s2.getStuInfo();
	}
}
