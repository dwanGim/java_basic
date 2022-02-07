package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {

	public static void main(String[] args) {
		// Random 객체를 생성한 다음 nextBoolean() 기능을 이용해서
		// 동전 던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을 때 true가 나오면 앞, false가 나오면 뒤
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("실행 횟수를 입력해주세요.");
		
		int n = sc.nextInt();
		
		
		int COIN_FACE = 0;
		int COIN_TAIL = 0;
		
		System.out.println(n + "회 동전을 던져보겠습니다.");
		
		
		for (int i = 0; i < n; i++) {
			
			boolean result = random.nextBoolean();
			
			if (result == true) {
				COIN_FACE++;
			} else {
				COIN_TAIL++;
			}
			
		}
		System.out.println(n + "번 동전을 던졌습니다.");
		System.out.println("앞면 : " + COIN_FACE);
		System.out.println("뒷면 : " + COIN_TAIL);
		

	}

}
