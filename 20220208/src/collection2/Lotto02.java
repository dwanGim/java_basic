package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto02 {

	public static void main(String[] args) {
		// list 역시 참조형 변수이기 때문에 주소값끼리 비교합니다.
		// 따라서 단순 == 비교 연산자로 동일 비교를 하는 게 아니라
		// list1.equals(list2)를 이용해 주소값이 아닌
		// 실제 합에 저장된 데이터 비교를 해줘야
		// 로또복권 리스트 내부 숫자가 일치하는지 비교할 수 있습니다.
		// equals는 내부 요소의 순서까지 같이 비교합니다.
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		// 둘 다 빈 리스트이지만 주소값은 다릅니다.
		System.out.println("주소값 비교 :" + (l1 == l2));
		
		// 둘 다 빈 리스트이므로 자료끼리 비교했을 때 true가 출력됩니다.
		System.out.println(l1.equals(l2));
		System.out.println("" + l1 + l2);
		
		// l1 과 l1에 각각 요소를 입력하되, 순서에 따른 결과 확인하기
		// l1 과 l2에 여러분들이 같은 자료를 넣어주세요. 대신 순서를 다르게 넣어보세요.
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println(l1);
		l2.add(3);
		l2.add(2);
		l2.add(1);
		System.out.println(l2);
		
		System.out.println(l1.equals(l2));
	
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2));
	}

}
