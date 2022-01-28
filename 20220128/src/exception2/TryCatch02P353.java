package exception2;

public class TryCatch02P353 {
	
	public static void main(String[] args) {
		// 어제 exception 패키지 내부의 예외 유형들이 여럿 있었는데
		// 그 중 하나를 골라서 예외가 발생할 수 있는 코드로 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch 블록을 활용합니다.
		// / by 0 (0으로 나누기)에 대한 처리는 허용하지 않습니다.
		
		
		String a = "15828ㄷㅂㅈ고fsdf";
		
		try {
			System.out.println("실행 시작!");
			int result = Integer.parseInt(a);
			System.out.println(result);
			System.out.println("계산 끝!");
		} catch(Exception e)	{
			System.out.println("예외 발생");
		}finally {
			
			System.out.println("코드 끝 !");
		}
		
		
		
		
	}
}
