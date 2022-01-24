package overloading;

public class Main01 {
	// 1. Calculator를 생성해주세요.
	public static void main(String[] args) {
		
	
	Calculator c1 = new Calculator();
		c1.plus(4);
		c1.plus(3, 2);
		c1.plus(0.2);
		c1.plus("ho hey");

	
	}
	
}
