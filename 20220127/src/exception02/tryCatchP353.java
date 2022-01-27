package exception02;

import java.util.Scanner;

public class tryCatchP353 {

	public static void main(String[] args) {
		// try~catch 구문은 크게 예외가 발생할 가능성이 있는 구문을 적어두는
		// try 블럭과, 예외가 실제로 발생했을 때 대처할 코드를 실행하는
		// catch 블럭으로 나뉩니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 a를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println("정수 b를 입력해주세요.");
		int b = scan.nextInt();
		// if~else 대신 try~ catch를 작성합니다.
		try {
			// try 영역에 예외가 발생할 가능성이 있는 구문을 전부 때려넣습니다.
			System.out.println("실행 시작!");
			System.out.println(a / b);
			System.out.println("계산 끝!");
		} catch(Exception e)	{
			// catch 블록에는 (Exception e)가 기본으로 들어감
			// Exception e 로 적는 경우 예외 종류를 막론하고 전부 처리 가능하다
			// 추후에 특정한 종류 예외를 따로 처리하고 싶으면 다른 예외명을 적으면 됨.
			System.out.println("나누는 숫자는 0이 될 수 없습니다.");
		}finally {
			// 모든 try~catch 영역의 로직이 끝나고 나서 실행할 코드
			System.out.println("코드 끝 !");
		}
	}

}
