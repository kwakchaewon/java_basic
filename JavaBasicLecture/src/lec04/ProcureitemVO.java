package lec04;


/**
 * 구매품목
 * @author gram17
 *
 */

// /** + enter: 클래스 주석
// VO(DTO): 특정 업무에 대한 데이터값을 변수로 지정하는 클래스 (id, name, quantity, price)

public class ProcureitemVO {
	// 접근 제한자: 외부에서 데이터 오염을 막기 위해 객체에 대한 접근을 제어할 수 있다.
	// ex) 병렬 프로그래밍할때 데이터 오염을 막기 위해 접근 제한자를 사용
	
	// public: 외부에서도 접근이 가능한 접근 제한자
	// private: 가장 엄격. 동일한 클래스 내에서만 접근 가능하며 외부에선 접근 불가
	// protected: 패키지 또는 하위 클래스에서 접근 가능. 상속 관계에 있는 하위 클래스에서 접근 가능
	
	private int id;
	private String name;
	private int quantity;
	private int price;
	
	
	// getter, setter: private 으로 선언한 값을 변경하고 가져다 쓰기 위해 사용
	// get, set: 값 가져오기, 값 변경
	// getter, setter 생성: source > generate getter setter > 필드 지정
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// toString(): 값을 문자열 형태로 로그에 찍어 값의 형태 형태 파악
	// source > generate toString() > 필드 지정
	
	@Override
	public String toString() {
		return "ProcureitemVO [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
}