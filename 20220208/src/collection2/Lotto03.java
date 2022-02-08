package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또 복권 당첨 시뮬레이터를 만들어주세요.
		// 몇 장을 사야 당첨되는지 시뮬레이션 해보겠습니다.
		
		List<Integer> lotto = new ArrayList<>();
		
		Random random = new Random();

		int count = 0;
		int getNum = 0;
		
		while (lotto.size() != 6) {
		 
			getNum = (int)(Math.random() * 45) + 1;
			
			if (!lotto.contains(getNum)) {
				lotto.add(getNum);
		 	}
			
		}
		
		Collections.sort(lotto);
		
		
		
		
		
	List<Integer> myLotto = new ArrayList<>();
		
	while(!lotto.equals(myLotto)) {
		myLotto.clear();
	
		while (myLotto.size() != 6) {
			
			getNum = (int)(Math.random() * 45) + 1;
				
			if (!myLotto.contains(getNum)) {
					myLotto.add(getNum);
			}
				Collections.sort(myLotto);
			}
		    System.out.print(lotto);
			System.out.println(myLotto);
			count++;
			
		}
	
		System.out.println("당첨 축하드립니다!");
		System.out.println("구입한 복권 개수 : " + count);
	}
}
