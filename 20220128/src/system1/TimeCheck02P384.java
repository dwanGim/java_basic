package system1;

public class TimeCheck02P384 {

	public static void main(String[] args) {
		// try ~ catch 구문의 소요시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요.
		// throw로 발생시키면 됩니다.
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);
		
		
		int randomNum = (int)(Math.random() * 2000000000);
		try {
			if(randomNum > 1000000000)	{
				
				throw new ArithmeticException();
				
			}else {
				System.out.println("정상 범위의 난수 발생");
			}
		} catch(Exception e)	{
			System.out.println("2분의 1 예외발생");
			
			e.printStackTrace();
		
		}
		long end = System.currentTimeMillis();
		System.out.println("끝난시간 : " + end);
		System.out.println("소요시간 : "+ (end - start));
		
	

}
}
