package lec07.jth.world.vo.chemicals;
/**
 * 한화솔루션/케미칼
 * @author gram17
 *
 */

// 싱글톤 패턴: 하나의 클래스가 하나의 인스턴스를 갖도록 하는 디자인 패턴
public class Hcc {
	
	private static Hcc hcc = new Hcc();
	
	// 생성자: 객체 생성시 호출되고 객체의 초기상태를 설정
	// 생성자 이름은 클래스 이름과 동일
	private Hcc() {
				
	}
	
	
	// getInstance(): 싱글톤 디자인 패턴에서 사용, 단일 인스턴스 생성 또는 반환
	// 변수가 생성되지 않은 경우 새로운 인스턴스 반환
	// 변수가 있다면 이미 존재하는 인스턴스 반환
	
	// 싱글톤 디자인 패턴은 클래스가 오직 하나의 인스턴스만을 갖도록 보장함. 중복 생성을 방지하고 일관된 상태를 유지
	// 글로벌한 접근 지점을 제공해 데이터를 중앙제어할 수 있음 
	// 그러나 남용시 코드를 복잡하게 만들수 있음
	
	public static Hcc getInstance() {
		return hcc;
	}
	
	private int salesAmt;		// 매출액
	private int propertyAmt;	// 자산액
	private int debtAmt;		// 부채액
	private int capitalAmt;		// 자산액
	private int totalEmployee;	// 총 종업원
	private String headOfficeAddress;		// 본점 주소
	private String companyProperty;			// 회사 속성 (조선, it, 화학, 전자)
	private String CompanyName;				// 회사명

	// private & getter/setter : 외부에서 함부로 값을 못바꾸도록 막아놓는 장치
	// getter: private 변수를 외부에서 볼 때
	// setter: private 변수값을 세팅할 때
	public int getSalesAmt() {
		return salesAmt;
	}

	public void setSalesAmt(int salesAmt) {
		this.salesAmt = salesAmt;
	}

	public int getPropertyAmt() {
		return propertyAmt;
	}

	public void setPropertyAmt(int propertyAmt) {
		this.propertyAmt = propertyAmt;
	}

	public int getDebtAmt() {
		return debtAmt;
	}

	public void setDebtAmt(int debtAmt) {
		this.debtAmt = debtAmt;
	}

	public int getCapitalAmt() {
		return capitalAmt;
	}

	public void setCapitalAmt(int propertyAmt, int debtAmt) {
		this.capitalAmt = propertyAmt - debtAmt;
	}

	public int getTotalEmployee() {
		return totalEmployee;
	}

	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}

	public String getHeadOfficeAddress() {
		return headOfficeAddress;
	}

	public void setHeadOfficeAddress(String headOfficeAddress) {
		this.headOfficeAddress = headOfficeAddress;
	}

	public String getCompanyProperty() {
		return companyProperty;
	}

	public void setCompanyProperty(String companyProperty) {
		this.companyProperty = companyProperty;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	@Override
	public String toString() {
		return "Hcc [salesAmt=" + salesAmt + ", propertyAmt=" + propertyAmt + ", debtAmt=" + debtAmt + ", capitalAmt="
				+ capitalAmt + ", totalEmployee=" + totalEmployee + ", headOfficeAddress=" + headOfficeAddress
				+ ", companyProperty=" + companyProperty + ", CompanyName=" + CompanyName + "]";
	}
	
	
	
}
