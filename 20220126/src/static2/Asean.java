package static2;

public class Asean {
	// 출석점수(check), 중간고사(midTerm), 기말고사(finalTerm)
	// 변수를 설정해주세요.
	private int check;
	private int midTerm;
	private int finalTerm;
	
	
	// 공용 발표점수인 presentation을 static으로 만들어주세요.
	// 이 점수는 19점입니다.
	private static int presentationScore = 19;
	
	// 생성자는 객체 생성 시 출석, 중간고사, 기말고사 점수만
	// 받아서 입력해줍니다.
	public Asean(int check, int midTerm, int finalTerm)	{
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
		
	}
	
	// 일반 메서드로 showAseanInfo()를 생성해주시되
	// 성적 전체를 콘솔에 조회하게 해주세요.
	
	public void showAseanInfo()	{
		System.out.println("학생의 정보입니다.");
		System.out.println("출석 : " + this.check + ", 중간고사 : " + this.midTerm 
				+ ", 기말고사 : " + this.finalTerm + ", 조별과제 : " + presentationScore);
		
	}
	
	// presentationScore는 private로 전환될 경우
	
	

	public int getCheck() {
		return check;
	}

	public static int getPresentationScore() {
		return presentationScore;
	}

	public static void setPresentationScore(int presentationScore) {
		Asean.presentationScore = presentationScore;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public int getMidTerm() {
		return midTerm;
	}

	public void setMidTerm(int midTerm) {
		this.midTerm = midTerm;
	}

	public int getFinalTerm() {
		return finalTerm;
	}

	public void setFinalTerm(int finalTerm) {
		this.finalTerm = finalTerm;
	}

	

	public static int getPresentation() {
		return presentationScore;
	}

	public static void setPresentation(int presentation) {
		Asean.presentationScore = presentation;
	}
	
	
	
}
