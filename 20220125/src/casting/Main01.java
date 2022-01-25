package casting;

public class Main01 {
	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있습니다.
		// cat, dog, animal을 하나씩 만들어줴요.
		// Animal c1, d1, a1으로 받아주세요.
		
		
		Animal c1 = new Cat("순이", 2);
		Animal d1 = new Dog("돌이", 1);
		Animal a1 = new Animal("null", 0);
		
		
		c1.sit();
		//c1.haaak();
		
		d1.sit();
		//d1.giveHand();
		
		a1.sit();
		
		// 각 자료형의 근본적 자료형에 맞춰서 되돌려보겠습니다.
		Cat cat = (Cat)c1;
		// c1은 Animal 타입이나, 힙에 저장된 데이터가 Cat
		// 이므로 Cat으로 변형이 가능합니다.
		cat.haaak();
		
		Dog dog = (Dog)d1;
		dog.giveHand();
		
		// a1은 힙/스택 모두에 Animal로만 저장되어 있어
		// 다른 자료형으로 변환이 불가능합니다.
		Cat cat2 = (Cat)a1;
		cat2.haaak();// <-고양이 기능없는 깡통 고양이가 만들어졌다.
	}
}
