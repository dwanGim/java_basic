package interaction;

public class Buyer {
	// 구매자는 money(소지금), mango(소지망고개수)를 맴버변수로 가집니다.
	private int money;
	private int mango;
	private int MANGO_PRICE;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.MANGO_PRICE = 5000;
		
	}
	public void showBuyer()	{
		System.out.println("------구매자의 정보입니다.---------");
		System.out.println("소지망고 : "+this.mango+", 소지금 : "+this.money);
	}
	// 소지망고, 소지금
	// 생성자에는 돈을 받아 소지금을 초기화해주고 망고는 0으로 초기화합니다.
	// 구매자 입장에서 망고를 구매하는 buyMango를 만듭니다.
	// 구매자가 buyMango를 호출할 때 판매자의 sellMango도 동시에 호출
	public void buyMango(Seller seller, int mango)	{
		// 내 금액이 차감되고 망고가 늘어나는 로직을 작성해주세요.
		this.mango += mango;
		this.money -= mango*this.MANGO_PRICE;
		seller.sellMango(mango);
	
	}
	
	



}
