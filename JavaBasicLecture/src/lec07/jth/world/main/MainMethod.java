package lec07.jth.world.main;

import lec07.jth.world.vo.chemicals.Hcc;
import lec07.jth.world.vo.chemicals.LGChem;
import lec07.jth.world.vo.chemicals.LotteChemical;
import lec07.jth.world.vo.electronics.LGElectronics;
import lec07.jth.world.vo.electronics.SKHynix;
import lec07.jth.world.vo.electronics.SamsungElectronics;

public class MainMethod {
	public static void main(String[] args) {
		
		// 기업정보 세팅
		// 한화 솔루션 케미칼
		Hcc hcc = Hcc.getInstance();
		
		// String hccName = "한화솔루션케미칼";
		String hccName			 				= String.valueOf("한화솔루션케미칼"); 
		String hccCompanyProperty				= String.valueOf("화학");
		String hccHeadOfficeAddress 			= String.valueOf("서울특별시 중구 청계천로 86");
		int hccTotalEmployee 					= 5730;
		int hccSalesAmt 						= 34493;
		int hccPropertyAmt						= 82246;
		int hccDebtAmt							= 32289;
		
		hcc.setCompanyName(hccName);
		hcc.setCompanyProperty(hccCompanyProperty);
		hcc.setHeadOfficeAddress(hccHeadOfficeAddress);
		hcc.setTotalEmployee(hccTotalEmployee);
		hcc.setSalesAmt(hccSalesAmt);
		hcc.setPropertyAmt(hccPropertyAmt);
		hcc.setDebtAmt(hccDebtAmt);
		hcc.setCapitalAmt(hccPropertyAmt, hccDebtAmt);
		
		
		
		// shift + tab: 코드 왼쪽으로 이동
		// LG 화학
		LGChem lgChem = LGChem.getInstance();
		
		String lgChemName			 			= String.valueOf("LG화학"); 
		String lgChemCompanyProperty			= String.valueOf("화학");
		String lgChemHeadOfficeAddress 			= String.valueOf("서울특별시 영등포구 128");
		int lgChemTotalEmployee 				= 20073;
		int lgChemSalesAmt 						= 286250;
		int lgChemPropertyAmt					= 340244;
		int lgChemDebtAmt						= 166406;
		
		lgChem.setCompanyName(lgChemName);
		lgChem.setCompanyProperty(lgChemCompanyProperty);
		lgChem.setHeadOfficeAddress(lgChemHeadOfficeAddress);
		lgChem.setTotalEmployee(lgChemTotalEmployee);
		lgChem.setSalesAmt(lgChemSalesAmt);
		lgChem.setPropertyAmt(lgChemPropertyAmt);
		lgChem.setDebtAmt(lgChemDebtAmt);
		lgChem.setCapitalAmt(lgChemPropertyAmt, lgChemDebtAmt);
		
		
		
		// 롯데 케미칼
		LotteChemical lotteChemical = LotteChemical.getInstance();
		
		String lotteChemicalName			 	= String.valueOf("롯데케미칼"); 
		String lotteChemicalCompanyProperty		= String.valueOf("화학");
		String lotteChemicalHeadOfficeAddress 	= String.valueOf("서울특별시 송파구 올림픽로 300");
		int lotteChemicalmTotalEmployee 		= 4540;
		int lotteChemicalSalesAmt 				= 151234;
		int lotteChemicalPropertyAmt			= 200431;
		int lotteChemicalDebtAmt				= 59899;
		
		lotteChemical.setCompanyName(lotteChemicalName);
		lotteChemical.setCompanyProperty(lotteChemicalCompanyProperty);
		lotteChemical.setHeadOfficeAddress(lotteChemicalHeadOfficeAddress);
		lotteChemical.setTotalEmployee(lotteChemicalmTotalEmployee);
		lotteChemical.setSalesAmt(lotteChemicalSalesAmt);
		lotteChemical.setPropertyAmt(lotteChemicalPropertyAmt);
		lotteChemical.setDebtAmt(lotteChemicalDebtAmt);
		lotteChemical.setCapitalAmt(lotteChemicalPropertyAmt, lotteChemicalDebtAmt);
				
		
		
		// LG전자
		LGElectronics lgElectronics = LGElectronics.getInstance();
		
		String lgElectronicsName			 	= String.valueOf("LG전자"); 
		String lgElectronicsCompanyProperty		= String.valueOf("전자");
		String lgElectronicsHeadOfficeAddress 	= String.valueOf("서울특별시 영등포구 여의대로 128");
		int lgElectronicsTotalEmployee 			= 39765;
		int lgElectronicsSalesAmt 				= 2886544;
		int lgElectronicsPropertyAmt			= 448598;
		int lgElectronicsDebtAmt				= 284347;
		
		lgElectronics.setCompanyName(lgElectronicsName);
		lgElectronics.setCompanyProperty(lgElectronicsCompanyProperty);
		lgElectronics.setHeadOfficeAddress(lgElectronicsHeadOfficeAddress);
		lgElectronics.setTotalEmployee(lgElectronicsTotalEmployee);
		lgElectronics.setSalesAmt(lgElectronicsSalesAmt);
		lgElectronics.setPropertyAmt(lgElectronicsPropertyAmt);
		lgElectronics.setDebtAmt(lgElectronicsDebtAmt);
		lgElectronics.setCapitalAmt(lgElectronicsPropertyAmt, lgElectronicsDebtAmt);
		
		
		
		// 삼성전자
		SamsungElectronics samsungElectronics = SamsungElectronics.getInstance();
		
		String samsungElectronicsName			 	= String.valueOf("삼성전자"); 
		String samsungElectronicsCompanyProperty	= String.valueOf("전자");
		String samsungElectronicsHeadOfficeAddress 	= String.valueOf("경기도 수원시 영통구 삼성로 129");
		int samsungElectronicsTotalEmployee 		= 106461;
		int samsungElectronicsSalesAmt 				= 1547000;
		int samsungElectronicsPropertyAmt			= 3017521;
		int samsungElectronicsDebtAmt				= 872067;
		
		samsungElectronics.setCompanyName(samsungElectronicsName);
		samsungElectronics.setCompanyProperty(samsungElectronicsCompanyProperty);
		samsungElectronics.setHeadOfficeAddress(samsungElectronicsHeadOfficeAddress);
		samsungElectronics.setTotalEmployee(samsungElectronicsTotalEmployee);
		samsungElectronics.setSalesAmt(samsungElectronicsSalesAmt);
		samsungElectronics.setPropertyAmt(samsungElectronicsPropertyAmt);
		samsungElectronics.setDebtAmt(samsungElectronicsDebtAmt);
		samsungElectronics.setCapitalAmt(samsungElectronicsPropertyAmt, samsungElectronicsDebtAmt);
		
		
		
		// SK하이닉스
		SKHynix skHynix = SKHynix.getInstance();
		
		String skHynixName			 				= String.valueOf("삼성전자"); 
		String skHynixCompanyProperty				= String.valueOf("전자");
		String skHynixHeadOfficeAddress 			= String.valueOf("경기도 수원시 영통구 삼성로 129");
		int skHynixTotalEmployee 					= 106461;
		int skHynixSalesAmt 						= 1547000;
		int skHynixPropertyAmt						= 3017521;
		int skHynixDebtAmt							= 872067;
		
		skHynix.setCompanyName(skHynixName);
		skHynix.setCompanyProperty(skHynixCompanyProperty);
		skHynix.setHeadOfficeAddress(skHynixHeadOfficeAddress);
		skHynix.setTotalEmployee(skHynixTotalEmployee);
		skHynix.setSalesAmt(skHynixSalesAmt);
		skHynix.setPropertyAmt(skHynixPropertyAmt);
		skHynix.setDebtAmt(skHynixDebtAmt);
		skHynix.setCapitalAmt(skHynixPropertyAmt, skHynixDebtAmt);
	
	
		System.out.println(hcc.toString());
		System.out.println(lgChem.toString());
		System.out.println(lotteChemical.toString());
		System.out.println(lgElectronics.toString());
		System.out.println(samsungElectronics.toString());
		System.out.println(skHynix.toString());
	}
}
