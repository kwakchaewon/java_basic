package lec14.collectionframework.samplecode08.service.impl;

import lec14.collectionframework.samplecode08.repository.impl.CallDataRepositoryImpl;
import lec14.collectionframework.samplecode08.service.CallDataService;

// 서비스에서는 업무적인 데이터 처리 작업 구현 (저장, 수정, 삭제 등)
public class CallDataServiceImpl implements CallDataService {

	CallDataRepositoryImpl callDataRepositoryImpl = null;
	
	public CallDataServiceImpl() {
		System.out.println("CallDataServiceImpl 기본 생성자");
		
		// 객체 생성시 싱글톤으로 구현한 CallDataRepositoryImpl 객체 (repository 객체) 를 땡겨옴
		callDataRepositoryImpl = CallDataRepositoryImpl.getInstance();
	}
		
	@Override
	public Object getNationData(String nationName) {
		return callDataRepositoryImpl.getNationData(nationName);
	}

	@Override
	public String getIndustryData(int paramIndex) {
		return callDataRepositoryImpl.getIndustryData(paramIndex);
	}
	
}
