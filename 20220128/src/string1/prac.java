package string1;
import java.util.Scanner;

public class prac {

	public class String03P399 {

		public static void main(String[] args) {
			// Scanner를 통해서 전체 문장을 입력받으세요.
			// 다음으로 문장 내에서 찾고 싶은 단어를 추가로 입력받으세요.
			// 문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
			// 출력해주는 코드를 작성해보세요.
			
			Scanner scan = new Scanner(System.in);
			System.out.println("원하는 문장을 입력해주세요. : ");
			String s1 = scan.nextLine();
			
			
			System.out.println("찾고 싶은 글자를 입력해주세요. : ");
			String s2 = scan.nextLine();
			
			
			int get = s1.indexOf(s2);
			System.out.println(get);
			
			int i = 0;
			i++;
			int count = 0;
			
		System.out.println(s1.charAt(i));
		
			
		}

	}

}
