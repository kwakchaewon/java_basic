package lec02;

import java.util.ArrayList;
import java.util.Iterator;

public class ForLoop03 {
	public static void main(String[] args) {
		
		// for(시작점, 조건, 증감연산)
		
		/*
		 * for(int i=0; i<5; i++) { System.err.println("i는 " + i + "입니다."); }
		 * 
		 * for(int i=0; i<5; ++i) { System.err.println("i는 " + i + "입니다."); }
		 */
		
		
		/* int whileCnt = 0; */
		
		/*
		 * while (whileCnt<5) { System.out.println("값은" + whileCnt++ +"입니다."); }
		 * 
		 * whileCnt = 0; while (whileCnt<5) { System.out.println("값은" + ++whileCnt
		 * +"입니다."); }
		 */
		
		
		/*
		 * ArrayList<String> teamList = new ArrayList<String>(); teamList.add("곽채원");
		 * teamList.add("유승원"); teamList.add("이지훈"); teamList.add("강승호");
		 * teamList.add("김희승");
		 * 
		 * for (String mem : teamList) { System.out.println("팀원 이름은 " + mem + "입니다."); }
		 */
		
		// 구구단
		for (int i=1; i<10; i++) {
			System.out.println("**** " + i + "단" + " ****");
				for(int j=1; j<10; j++) { 
					System.out.println(i + "x" + j + "=" + i*j);
					}		
		}
		
		
		// break: 루프에서 빠져나올때
		int whileCnt = 0;
		boolean isTrue = true;
		
		while(isTrue) {
			whileCnt ++;
			System.out.println("if whileCnt는 " + whileCnt);
			if (whileCnt==10) {
				break;
			}
		}
		
		// contine: 다음 루프로 넘어갈 때
		//369 게임
		for(int i=1; i<100; i++) {
			if (i%3==0) {
				System.out.println("(짝!)");
				continue;
			}
			
			System.out.println(i);
		}
		
		
		
		
	
		
		
	}

}
