package lec04;

public class ObjClass02 {
	
	public static void main(String[] args) {
		
		ProcurementDocument procureItemDocument = new ProcurementDocument();
		ProcurementDocument procureItemDocument2 = new ProcurementDocument();
		
		
		// 변수값 할당
		procureItemDocument.procureRequestDocumentQty = 10;
		procureItemDocument.orderRequestDocumentQty = 5; 
		procureItemDocument.orderDocumentQty = 3;
		procureItemDocument.constractDocumentQty = 20;
		procureItemDocument.estimateDocumentQty = 25;
		
		System.out.println(procureItemDocument.procureRequestDocumentQty);
		System.out.println(procureItemDocument.orderRequestDocumentQty);
		System.out.println(procureItemDocument.orderDocumentQty);
		System.out.println(procureItemDocument.constractDocumentQty);
		System.out.println(procureItemDocument.estimateDocumentQty);
		
		int getTotalDocuQty = procureItemDocument.totalDocumentQtyDailyMake();
		System.out.println("getTotalDocuQty ::: " + getTotalDocuQty);
		
	}
	
	// static: 정적 메서드. 모든 인스턴스/매서드를 객체 생성없이 사용할 수 있다.
	// 주로 데이터 공유, 공통 메서드를 구현하는데 유용하다
	// 변수에 static 이 붙은 경우 할당되는 메모리가 다르기 때문에 남발하면 안됨.
}
