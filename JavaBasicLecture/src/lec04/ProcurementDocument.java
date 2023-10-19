package lec04;

/**
 * 구매 문서
 * @author gram17
 *
 */

public class ProcurementDocument {
	
	public int procureRequestDocumentQty; // 구매요청
	public int orderRequestDocumentQty; // 발주 요청
	public int orderDocumentQty; // 발주
	public int constractDocumentQty; // 단가 계약
	public int estimateDocumentQty; // 견적
	
	public int totalDocumentQtyDailyMake() {
		
		int totalDocument = procureRequestDocumentQty + orderRequestDocumentQty
				+ orderDocumentQty + constractDocumentQty + estimateDocumentQty;
		
		return totalDocument;
	}

}
