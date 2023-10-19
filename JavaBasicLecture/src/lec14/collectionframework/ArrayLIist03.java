package lec14.collectionframework;

import java.util.ArrayList;

public class ArrayLIist03 {
	
	public static void main(String[] args) {
//		ArrayList sampleList = new ArrayList();
//		
//		sampleList.add(1);
//		sampleList.add("한국");
//		sampleList.add(true);
//		sampleList.add("안녕");
//		
//		// 출력 방법1
//		System.out.println(sampleList.toString());
//		
//		
//		// 출력 방법2
//		int sampleSize = sampleList.size();
//		
//		for (int x=0; x<sampleSize;x++) {
//			Object o = sampleList.get(x);
//			System.out.println("object ::: " + o);
//		}
		
//      출력결과
//		[1, 한국, true, 안녕]
//		object ::: 1
//		object ::: 한국
//		object ::: true
//		object ::: 안녕
		
		
		// generic 을 활용한 arraylist
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(3);
		intArrayList.add(4);
		intArrayList.add(5);
		
		int intArraySize = intArrayList.size();
		
		for (int x=0; x<intArraySize; x++) {
			Integer o = intArrayList.get(x);
			System.out.println(x + "번째 get int ::: " + o);
		}
		
		
	}

}


// 출력결과
//0번째 get int ::: 1
//1번째 get int ::: 2
//2번째 get int ::: 3
//3번째 get int ::: 4
//4번째 get int ::: 5