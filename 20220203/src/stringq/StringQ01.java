package stringq;

import java.util.Scanner;

public class StringQ01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력해주세요.");
		String sentence = scan.nextLine();
		
		System.out.println("문장 내에서 카운팅할 단어를 입력해주세요.");
		String searchVoca = scan.nextLine();
		
		int count = 0;
		// 반복문 추가 실행 여부
		boolean bool = true;
		int fidx = -1;
		
	
		while(bool)	{
			
			int get =  sentence.indexOf(searchVoca, fidx + 1);
			// indexOf를 실행했는데 -1이 나온다면
			// 더 찾을 필요가 없다는 의미임.
			
			if (get == -1) {
				// get에 -1이 저장된다면 조회할 필요가 없으므로
				// bool을 false로 바꿔
				// while문을 탈출하게 합니다.
				bool = false;
			}else {
				// 마지막 발견지점 갱신
				fidx = get;
				count++;
				System.out.println(get + "번 인덱스에서 " + 
				count + " 번째 " + searchVoca + " 이(가) 검출되었습니다.");
				
			}
		
		}
		System.out.println(searchVoca + " 의 총 출현 횟수는 : " + count);
	}
}
