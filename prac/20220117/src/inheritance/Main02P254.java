package inheritance;

public class Main02P254 {
	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		// 생성한 객체의 정보를 getInfo()를 이용해 콘솔에 같이 찍어주세요.
		
		
		Student s3 = new Student();
		s3.name = "성춘향";
		s3.age = 16;
		s3.stuNum = 58332895;
		
		Salaryman n1 = new Salaryman();
		n1.name = "김동완";
		n1.age = 27;
		n1.salary = 300000000;
		
		s3.getStuInfo();
		n1.getSalaryInfo();
	}
}
