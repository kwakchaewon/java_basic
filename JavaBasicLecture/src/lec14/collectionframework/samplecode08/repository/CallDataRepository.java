package lec14.collectionframework.samplecode08.repository;


// implement 에서 사용할 기본적인 메서드 정의
// 해당 인터페이스를 사용하는 클래스는 인터페이스에 정의된 기능 목록을 무조건 사용해야함
public interface CallDataRepository {
	
	// 국가 이름으로 국가 데이터로 가져오기
	public Object getNationData(String nationName);
	
	// 인덱스로 산업 데이터 가져오기
	public String getIndustryData(int paramIndex);
}
