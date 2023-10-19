package lec14.collectionframework.samplecode08.repository.impl;

import lec14.collectionframework.samplecode08.repository.CallDataRepository;

//인터페이스 상속 받는 법
//implement 후 add unimplement method
public class CallDataRepositoryImpl implements CallDataRepository{

	// 싱글톤 패턴 선언 (DB선언)
	DataRepository dataRepository = DataRepository.getInstance();
	
	private static CallDataRepositoryImpl instance = new CallDataRepositoryImpl();
	
	public static CallDataRepositoryImpl getInstance() {
		return instance;
	}
	
	// 생성자 : 싱글톤 패턴을 구현하기 위한 프라이빗 접근 제한자를 사용한 기본 생성자
	private CallDataRepositoryImpl(){
		System.out.println("CallDataRepositoryImpl 기본 생성자");
	}
	
	
	@Override
	public Object getNationData(String nationName) {
		return dataRepository.savedDataLkMap.get(nationName);
	}

	@Override
	public String getIndustryData(int paramIndex) {
		return dataRepository.savedDataArrList.get(paramIndex);
	}
	
}