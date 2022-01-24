package overloading;

public class Parttimer {
	// 파트타이머의 정보
	// 오전여부(afternoon), 시급(pay), 가계명(shopName), 본인이름(name)
	private boolean afternoon;
	private int pay;
	private String shopName;
	private String name;
	
	// 생성자 오버로딩은 생성자도 메서드이니 생성자를 여러 개 오버로딩 형식으로
	// 만드는 것입니다.
	// afternoon, pay, shopName, name을 모두 받아 저장해주는 생성자를 만들어주세요.
	// 접근 제한자는 public 입니다.
	
	public Parttimer(boolean a, int p, String s, String n)	{
		// 시급이 9160원 이하라면 강제로 9160을 집어넣고
		// 아니면 입력받은 금액을 그대로 입력하도록 수정해보세요.
		afternoon = a;
		pay = p;
		shopName = s;
		name = n;
		
		if (pay < 9160) {
			pay = 9160;
		}
	}
	
	// 오버로딩은 이름은 같은데 파라미터 값의 종류나 개수가 다르면 중복 작성을 허용합니다.
	// afternoon, shop, name만 입력받는 생성자를 하나 더 중복작성 해주세요.
	
	public Parttimer(boolean a, String s, String n)	{
		afternoon = a;
		shopName = s;
		name = n;
		pay = 9160;
	}
	
	public void getInfo()	{
		System.out.println(name + " 알바생의 정보입니다.");
		System.out.println("가게명 : "+shopName+", 오후파트 : "+afternoon+", 시급 : "+pay);
	}
}
