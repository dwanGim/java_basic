package polymorphism;

public class Main02P302 {
	public static void main(String[] args) {
		
		
		Person x1 = new Programer("성춘향", 16, "문예");
		Person x2 = new Police("향단이", 15, "이경");
		
		x1.showPerson();
		// Programer x1으로 받을 때.
		// x1.showProgramer(); 가능
		System.out.println("---------------");
		x2.showPerson();
		// Police x2로 받을 때.
		// x2.showPolice(); 가능
		
	}
}
