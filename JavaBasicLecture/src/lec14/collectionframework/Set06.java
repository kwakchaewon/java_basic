package lec14.collectionframework;

import java.util.HashSet;

// HashSet
public class Set06 {
	public static void main(String[] args) {
		HashSet hset = new HashSet();
		
		hset.add(1);
		hset.add(1);
		hset.add(1);
		hset.add(1);
		hset.add(2);
		
		System.out.println(hset.toString());
	}
}

// 출력결과
// [1, 2]