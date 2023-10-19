package lec01;

import java.util.ArrayList;

public class Array05 {
	public static void main(String[] args) {
		
		// 배열: 크기가 고정, 실무에선 잘 안쓰임
		// 배열(array) 선언
		// 방법1
		int [] arrA = new int[]{1,2,3,4,5};
		
		// 방법2
		int [] arrB = new int[5];
		arrB[0] = 1;
		arrB[2] = 2;
		arrB[3] = 3;
		arrB[4] = 4;
		arrB[5] = 5;
		
		// 리스트는 크기가 고정되지 않음
		// 리스트는 add 메서드를 통해 상대적으로 쉽게 값을 추가할 수 있다.
		// 배열 대신 컬렉션 프레임워크가 쓰이는 이유
		ArrayList<Integer> sampleList = new ArrayList();
		sampleList.add(1);
		sampleList.add(2);
		
	}
}
