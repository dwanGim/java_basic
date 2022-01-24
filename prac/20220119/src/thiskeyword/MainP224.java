package thiskeyword;

public class MainP224 {
	
	public static void main(String[] args) {
		// Person을 하나 먼저 생성해주세요.
		Person p1 = new Person("종일이", 10, 100, "로봇수사");
		p1.getInfo();
		
		// Person을 하나 더 생성해주세고 조회.
		Person p2 = new Person("허준", 30, 500, "한의학과");
		p2.getInfo();
	}
}
