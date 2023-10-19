package lec14.collectionframework.samplecode08.main;

import lec14.collectionframework.samplecode08.service.impl.CallDataServiceImpl;

public class MainMethod {
	
	public static CallDataServiceImpl callDataService = new CallDataServiceImpl();
	
	public static void main(String[] args) {
		
		String industryData = callDataService.getIndustryData(1);
		System.out.println("industryData: " + industryData);
		
		Object getNationName = callDataService.getNationData("국가1");
		System.out.println("getNationName : " + getNationName);
	
	}
}



// 출력결과
// CallDataServiceImpl 기본 생성자
// DataRepository 생성자
// CallDataRepositoryImpl 기본 생성자
// industryData: 자동차
// getNationName : 한국
