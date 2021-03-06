package interaction;

public class Seller {
	// 변수로 int money(매출), int mango(재고)를 가집니다.
	private int money;
	private int mango;
	private int MANGO_PRICE;
	// 가독성을 높이기 위해 숫자 대신 넣는 변수는
	// 카멜 케이스로 작성하지 않습니다.
	public Seller(int mango) {
		this.money = 0;
		this.mango = mango;
		this.MANGO_PRICE = 5000;
	}
	
	// showSeller
	public void showSeller() {
		System.out.println("------상인의 정보입니다.-------");
		System.out.println("현재 매출 : "+this.money+", 현재 재고 : "+this.mango);
	}
	
	// sellMango(int mango)	를 이용해서 개수 입력받습니다.
	// 자신의 망고는 입력받은 망고개수만큼 차감하고, this.money는
	// 망고갯수*망고가격만큼 증가하게 해주세요
	public void sellMango(int mango)	{
		this.mango -= mango;
		this.money += mango*MANGO_PRICE;
	}
}
