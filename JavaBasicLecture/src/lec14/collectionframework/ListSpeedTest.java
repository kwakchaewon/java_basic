package lec14.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

// ArrayList - LinkedList 속도 비교
public class ListSpeedTest {
	public static void main(String[] args) {
		
		// 1. ArrayList 속도 측정
		long startMills = System.currentTimeMillis();
		ArrayList<Integer> arList = new ArrayList<Integer>();
		
		for (int i=0; i<100000; i++) {
			arList.add(i);
		}
		
		long endMills = System.currentTimeMillis();
		long timeDiff = endMills - startMills;
		
		System.out.println("ArrayList 소요시간 ::: " + timeDiff);
		
		
		// 2. LinkedList 속도 측정
		startMills = System.currentTimeMillis();
		LinkedList<Integer> lkList = new LinkedList<Integer>();
		
		for (int i=0; i<100000; i++) {
			lkList.add(i);
		}
		
		endMills = System.currentTimeMillis();
		timeDiff = endMills - startMills;
		
		System.out.println("LinkedList 소요시간 ::: " + timeDiff);
		
//		ArrayList 소요시간 ::: 9
//		LinkedList 소요시간 ::: 6
		
	}
}
