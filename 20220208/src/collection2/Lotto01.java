package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto01 {

	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1~45 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
		// ArrayList의 정렬은 .sort()대신
		// Collections.sort(ArrayList)를 사용합니다.
		
		Random random = new Random();
		
		List<Integer> lotto = new ArrayList<>();
		
		int getNum = 0;
		
		while (lotto.size() != 6) {
		 
			getNum = (int)(Math.random() * 45) + 1;
			
			if (!lotto.contains(getNum)) {
				lotto.add(getNum);
		 	}
			
		}
		
		int lotto2 = random.nextInt(45) + 1;
		
		while (lotto.contains(lotto2)) {
		
		lotto2 = random.nextInt(45) + 1;
		
		}
		
		Collections.sort(lotto);
		
		System.out.println("추첨된 번호 : " + lotto);
		
		System.out.println("보너스 당첨 번호 : " + lotto2 );
	
	}

}
