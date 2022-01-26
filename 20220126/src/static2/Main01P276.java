package static2;

public class Main01P276 {
	
	public static void main(String[] args) {
		// Asean 조원 생성없이 발표점수를 콘솔에 찍어보세요.
		// System.out.println(Asean.presentationScore);
		// static 도 정보은닉이 적용됩니다.
		
		// Asean 조원 4명을 자율적으로 만든 다음, 각 인원의 성적을 조회해주세요.
		Asean a1 = new Asean(20, 15, 20);
		Asean a2 = new Asean(5, 10, 10);
		Asean a3 = new Asean(15, 20, 15);
		Asean a4 = new Asean(10, 20, 10);
		
		a1.showAseanInfo();
		System.out.println("---------------");
		a2.showAseanInfo();
		System.out.println("---------------");
		a3.showAseanInfo();
		System.out.println("---------------");
		a4.showAseanInfo();
	
		System.out.println(Asean.getPresentation());
		
	}
}
