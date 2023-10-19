package lec02;

public class Sample01 {
	public static void main(String[] args) {
		
		// 랜덤 숫자 10개 뽑기
		for(int i=0; i<10; i++) {
			double random = (int) (Math.random()*10);
			System.out.println(i+ " ::: random ::: " + random);
		}
		
		
		// 1~10까지 3으로 나눴을 때 나머지 출력
		for(int i=1; i<11; i++) {
			if(i%3==0) {
				System.out.println(i + " : 3으로 나눈 나머지는 0 입니다");
			} else if(i%3==1) {
				System.out.println(i + " : 3으로 나눈 나머지는 1 입니다");				
			} else {
				System.out.println(i + " : 3으로 나눈 나머지는 2 입니다");	
			}
		}
		
		
		// StringBuilder: 문자열 동적 수정시 사용되는 자료형
		
		StringBuilder sbPlus = new StringBuilder();
		String[] arrStr = new String[] {"가","나", "다", "라", "마", "사", "아", "차", "카","타", "파", "하"};
		
		for (int i=0; i<10; i++) {
			int randNum = (int) (Math.random()*10); //1. Math.random(): double 형태의 0~1 사이 난수 출력
			System.out.println("랜덤한 값을 출력합니다 ::: " + arrStr[randNum]); // 2. 출력 문자 확인
			sbPlus.append(arrStr[randNum]); // 3. 출력 문자 StringBuilder 맨 뒤에 추가
		}
		
		System.out.println("문자열:  " + sbPlus.toString()); // 4. 최종 문자열 출력
		
	}
}
