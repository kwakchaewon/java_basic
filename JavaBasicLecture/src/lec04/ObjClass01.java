package lec04;

public class ObjClass01 {
	public static void main(String[] args) {
		
		ProcureitemVO procureitemVO = new ProcureitemVO();
		
		System.out.println("아무것도 세팅하지 않은 객체 ::: " + procureitemVO.toString());
		procureitemVO.setId(1);
		procureitemVO.setName("옥수수");
		procureitemVO.setPrice(10000);
		procureitemVO.setQuantity(2);
		
		System.out.println("아무것도 세팅하지 않은 객체 ::: " + procureitemVO.toString());
		
	}
	
//	출력결과
//	아무것도 세팅하지 않은 객체 ::: ProcureitemVO [id=0, name=null, quantity=0, price=0]
//	아무것도 세팅하지 않은 객체 ::: ProcureitemVO [id=1, name=옥수수, quantity=2, price=10000]
}
