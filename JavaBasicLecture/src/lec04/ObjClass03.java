package lec04;

public class ObjClass03 {
	public static void main(String[] args) {
		
		ProcureItemDocument procureItemDocument = new ProcureItemDocument();
		
		procureItemDocument.id = 1;
		procureItemDocument.procureItemName = "의자";
		procureItemDocument.procureItemUnitName = "개";
		procureItemDocument.procureItemQty = 1000;
		procureItemDocument.procureItemPrice = 3;
		
		int addItemQtyPrice = procureItemDocument.addProcureItemQtyPrice();
		System.out.println("addProcureItemQtyPrice ::: " + addItemQtyPrice);
		
		String concatStrVal = procureItemDocument.concatStringValue();		
		System.out.println(concatStrVal);
		procureItemDocument.showEachVariableValue();
	}
}
