package lec14.collectionframework.samplecode08.repository.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

// 가상의 데이터베이스 역할을 하는 클래스
public class DataRepository {
	
	private static DataRepository instance = new DataRepository();
	
	// 싱글톤 패턴:객체를 한개만 생성해 계속 사용할 수 있음
	// 하나의 객체의 값을 여러 곳에서 공통으로 사용
	// 메모리 사용을 줄이거나 동일한 객체의 데이터를 사용할 때
	// 일종의 데이터 베이스역할도 수행
	public static DataRepository getInstance() {
		return instance;
	}
	
	
	// static 으로 안한 이유: 하나의 객체에서 이 데이터에 접근해 사용하기 때문에 (싱글톤 패턴이기 때문에)
	public LinkedHashMap<String, Object> savedDataLkMap = null;
	public ArrayList<String> savedDataArrList = null;
	
	
	// 생성자에서 데이터 세팅
	// 생성자란? 인스턴스가 생성될 때 호출되는 초기화 메서드
	private DataRepository(){
		
		System.out.println("DataRepository 생성자");
		
		savedDataLkMap = new LinkedHashMap<String, Object>();
		savedDataArrList = new ArrayList<String>();
		
		savedDataLkMap.put("국가1", "한국");
		savedDataLkMap.put("국가2", "미국");
		savedDataLkMap.put("국가3", "중국");
		savedDataLkMap.put("국가4", "일본");
		savedDataLkMap.put("국가5", "러시아");
		
		savedDataArrList.add("전기");
		savedDataArrList.add("자동차");
		savedDataArrList.add("조선");
		savedDataArrList.add("IT");
		savedDataArrList.add("디스플레이");
		savedDataArrList.add("건설");
		savedDataArrList.add("에너지");
	}
	
	
}
