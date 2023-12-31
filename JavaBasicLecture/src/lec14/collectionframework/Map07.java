package lec14.collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map07 {
	public static void main(String[] args) {
		// hashcode: 객체를 식별하기 위한 정수값
		// 모든 객체는 hashCode() 매서드를 상속받음
		
		
		// map 은 key, value 형태를 가지며 HashMap, LinkedHashMap은 map을 상속받은 형태
		
		// HashMap: 순서에 상관없이 삽입 (많이 씀)
		HashMap hashmap = new HashMap();
		hashmap.put("국가1", "한국");
		hashmap.put("국가2", "미국");
		hashmap.put("국가3", "중국");
		hashmap.put("국가4", "러시아");
		hashmap.put("국가5", "일본");
		
		System.out.println(hashmap.toString());
		
		
		// LinkedHashMap : 순서가 있음. HashMap 을 순차적으로 정렬
		LinkedHashMap lkHashMap = new LinkedHashMap();
		lkHashMap.put("국가1", "한국");
		lkHashMap.put("국가2", "미국");
		lkHashMap.put("국가3", "중국");
		lkHashMap.put("국가4", "러시아");
		lkHashMap.put("국가5", "일본");
		
		System.out.println(lkHashMap.toString());
		
		
		// 해쉬코드 출력1
		String testA1 = "a";
		String testA2 = "a";
		
		int hc1 = testA1.hashCode();
		int hc2 = testA2.hashCode();
		
		System.out.println("hc1 ::: " + hc1);
		System.out.println("hc2 ::: " + hc2);
		
		
		// 해쉬코드 출력2
		String nationName1 = String.valueOf("한국");
		String nationName2 = String.valueOf("한국");
		
		int nn1hc = nationName1.hashCode();
		int nn2hc = nationName2.hashCode();
		
		System.out.println("nn1hc ::: " + nn1hc);
		System.out.println("nn2hc ::: " + nn2hc);
		
	}
}
