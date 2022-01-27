package interface1;

public class Main02P320 {
	// 기차를만들어서 잘 작동하는지 체크
	public static void main(String[] args) {
		
	
	Vehicle t1 = new Train("은하철도 999");
	t1.accel();
	t1.accel();
	t1.showStatus();
	t1.breakSpeed();
	t1.breakSpeed();
	t1.showStatus();
	t1.reFuel();
	t1.showStatus();
	
	
	}
}
