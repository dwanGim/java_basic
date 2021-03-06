package math1;

public class Math06P480 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random()을 이용해 1/3확률로 가위, 바위, 보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보> 가위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		// 조건식에 
		int myValue = (int)(Math.random()*3);
		int comValue = (int)(Math.random()*3);
		// 0 = 가위, 1 = 바위, 2 = 보
		// 0 > 2, 1 > 0, 2 > 1
		
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		/* 가장 생각하기 쉬운 결과도출
		if (myValue == 0 && comValue == 2) {
			
			System.out.println("내가 승리했습니다.");
			System.out.println("내가 뽑은 것 : 가위");
			System.out.println("컴퓨터가 뽑은 것 : 보");
			
		}
		
		if (myValue ==0 && comValue == 1)	 {
			System.out.println("졌습니다.");
			System.out.println("내가 뽑은 것 : 가위");
			System.out.println("컴퓨터가 뽑은 것 : 바위");
		
		}
		
		if (myValue == 0 && comValue == 0) {
			System.out.println("무승부");
			System.out.println("내가 뽑은 것 : 가위");
			System.out.println("컴퓨터가 뽑은 것 : 가위");
		
		}
		
		if (myValue == 0 && comValue == 2) {
			
			System.out.println("내가 승리했습니다.");
			System.out.println("내가 뽑은 것 : 가위");
			System.out.println("컴퓨터가 뽑은 것 : 보");
			
		}
		
		if (myValue ==0 && comValue == 1)	 {
			System.out.println("졌습니다.");
			System.out.println("내가 뽑은 것 : 가위");
			System.out.println("컴퓨터가 뽑은 것 : 바위");
		
		}
		
		if (myValue == 0 && comValue == 0) {
			System.out.println("무승부");
			System.out.println("내가 뽑은 것 : 가위");
			System.out.println("컴퓨터가 뽑은 것 : 가위");
		
		}
		
		if (myValue == 1 && comValue == 2)	{
			System.out.println("졌습니다.");
			System.out.println("내가 뽑은 것 : 바위");
			System.out.println("컴퓨터가 뽑은 것 : 보");
		}
		
		if (myValue == 1 && comValue == 1)	{
			System.out.println("무승부입니다.");
			System.out.println("내가 뽑은 것 : 바위");
			System.out.println("컴퓨터가 뽑은 것 : 바위");
		}
		
		if (myValue == 1 && comValue == 0) {
			System.out.println("내가 승리했습니다.");
			System.out.println("내가 뽑은 것 : 바위");
			System.out.println("컴퓨터가 뽑은 것 : 가위");
		}
		
		if (myValue == 2 && comValue == 2)	{
			System.out.println("무승부입니다.");
			System.out.println("내가 뽑은 것 : 보");
			System.out.println("컴퓨터가 뽑은 것 : 보	");
		}
		
		if (myValue == 2 && comValue == 1)	{
			System.out.println("내가 승리했습니다.");
			System.out.println("내가 뽑은 것 : 보");
			System.out.println("컴퓨터가 뽑은 것 : 바위");
		}
		
		if (myValue == 2 && comValue == 0)	{
			System.out.println("졌습니다.");
			System.out.println("내가 뽑은 것 : 보");
			System.out.println("컴퓨터가 뽑은 것 : 가위");
		}
		
		*/
	}

}
