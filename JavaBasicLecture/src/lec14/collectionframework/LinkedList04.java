package lec14.collectionframework;

import java.util.LinkedList;

//Linked List
public class LinkedList04 {
	public static void main(String[] args) {
		
		LinkedList lkList = new LinkedList();
		
		lkList.add("a");
		lkList.add("b");
		lkList.add("c");
		lkList.add("d");
		lkList.add("e");
		
		System.out.println(lkList.toString());
		
		// 다음과 같이 중간에 데이터 수정이 많은 작업일때는 LinkedList가 유리
		lkList.add(1, "good");
		System.out.println(lkList.toString());		
		
	}
}
