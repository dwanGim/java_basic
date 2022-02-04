package stringbuilder1;

public class BuilderQ {

	public static void main(String[] args) {
		// 선생님의 풀이입니다.
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		int checkNum = a.length() % 3;
		
		int loopNum = a.length() - checkNum;
		
		for(int i = loopNum; i > -1; i--) {
			if (i % 3 == 0) {
				a.deleteCharAt(i);
			
			}
			
		}
		System.out.println(a);
		
	}

}
