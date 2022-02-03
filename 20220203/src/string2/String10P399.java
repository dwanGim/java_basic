package string2;

import java.util.Scanner;

public class String10P399 {

	public static void main(String[] args) {
		// 로그인 로직을 만들어보겠습니다.
		// 먼저 String id에 여러분이 설정한 임의의 아이디를
		String id = "qazxsw4354";
		String pw = "1q2w3e4r!";
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요.");
		String uId = sc.nextLine();
		
		if (id.equals(uId)) {
			System.out.println("패스워드를 입력해주세요.");
			String uPw = sc.nextLine();
			if (pw.equals(uPw)) {
				System.out.println("환영합니다. " + uId + " 님.");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		// Sting pw에 여러분이 설정한 임의의 비밀번호를 저장해주세요.
		
		// 다음, 사용자에게 Scanner를 이용해
		
		
		
		// uId변수에는 아이디를(사용자가 입력한 아이디)
		
		// 조건문을 이용해서 기본 id가 입력받은 자료와 일치하면
		
			// uPw변수에는 비밀번호를(사용자 입력) 받아서

	}

}
