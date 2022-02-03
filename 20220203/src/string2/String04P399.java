package string2;

public class String04P399 {

	public static void main(String[] args) {
		// .length()는 문자열의 길이를 알 수 있습니다.
		// 정수로 몇 글자인지 알려줍니다.
		String name ="김수한무 거북이와 두루미 삼천갑자 동방삭 치치카포 사리사리센타";
		System.out.println(name.length());

		
		// .replace()는 찾아바꾸기 입니다.
		// .replace("찾을 단어" , "바꿔줄 단어"); tnsdmfh dlqfurgkqslek.
		String report = "안녕하세요. 리포트 보고자는 김영수, 김영수 입니다.";
		// return;처럼 이건 콘솔에 저장하는 개념이 아닙니다.
		System.out.println(report.replace("김영수", "김동완"));
		System.out.println(report);
		
		// 바뀐 내역을 저장하고 싶다면
		report = report.replace("김영수", "김동완");
		System.out.println(report);
	}

}
