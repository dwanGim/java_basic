package exception1;

public class Exception05P348 {

	public static void main(String[] args) {
		// 예외발생 5.
		// 숫자베이스가 아닌 문자를 숫자로 바꾸려고 할 때
		String a = "1000abc";
		int result = Integer.parseInt(a);
		System.out.println(result);
	}

}
