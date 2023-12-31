package lec07.jth.world.vo.electronics;

import lec07.jth.world.vo.chemicals.LGChem;

/**
 * sk하이닉스
 * @author gram17
 *
 */
public class SKHynix {
private static SKHynix skHynix = new SKHynix();
	
	private SKHynix() {
		
	}
	
	public static SKHynix getInstance() {
		return skHynix;
	}
	
	private int salesAmt;		// 매출액
	private int propertyAmt;	// 자산액
	private int debtAmt;		// 부채액
	private int capitalAmt;		// 자산액
	private int totalEmployee;	// 총 종업원
	private String headOfficeAddress;		// 본점 주소
	private String companyProperty;			// 회사 속성 (조선, it, 화학, 전자)
	private String CompanyName;				// 회사명

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
		return "SKHynix [salesAmt=" + salesAmt + ", propertyAmt=" + propertyAmt + ", debtAmt=" + debtAmt
				+ ", capitalAmt=" + capitalAmt + ", totalEmployee=" + totalEmployee + ", headOfficeAddress="
				+ headOfficeAddress + ", companyProperty=" + companyProperty + ", CompanyName=" + CompanyName + "]";
	}
	
}
