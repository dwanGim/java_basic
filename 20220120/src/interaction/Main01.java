package interaction;

public class Main01 {
	public static void main(String[] args) {
		// 판매자 하나 생성
		Seller s1 = new Seller(100);
		s1.showSeller();
		
		Buyer b1 = new Buyer(1000000);
		b1.showBuyer();
		
		b1.buyMango(s1, 5);
		
		s1.showSeller();
		b1.showBuyer();
		
		
		
	}
}
