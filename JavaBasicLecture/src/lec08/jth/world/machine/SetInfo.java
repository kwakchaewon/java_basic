package lec08.jth.world.machine;

import lec07.jth.world.vo.chemicals.Hcc;
import lec07.jth.world.vo.chemicals.LGChem;
import lec07.jth.world.vo.chemicals.LotteChemical;
import lec07.jth.world.vo.electronics.LGElectronics;
import lec07.jth.world.vo.electronics.SKHynix;
import lec07.jth.world.vo.electronics.SamsungElectronics;


// 일종의 자동화 기구 설계
public class SetInfo {
	
    public Hcc hcc                             = Hcc.getInstance();
    public LGChem lgChem                       = LGChem.getInstance();
    public LotteChemical lotteChemical         = LotteChemical.getInstance();
    public LGElectronics lgElectronics         = LGElectronics.getInstance();
    public SamsungElectronics samElec          = SamsungElectronics.getInstance();
    public SKHynix skhynix                     = SKHynix.getInstance();

    public void setCompanyInfo() {
        // 기업정보 셋팅
        // 한화솔루션케미칼
        String hccName                  = String.valueOf("한화솔루션케미칼");
        String hccCompanyProperty       = String.valueOf("화학");
        String hccHeadOfficeAddress     = String.valueOf("서울특별시 중구 청계천로 86 한화빌딩");
        int hccTotalEmployee            = 5730;
        int hccSalesAmt              	= 34493;
        int hccPropertyAmt           	= 82446;
        int hccDebtAmt               	= 32289;

        hcc.setCompanyName(hccName);
        hcc.setCompanyProperty(hccCompanyProperty);
        hcc.setHeadOfficeAddress(hccHeadOfficeAddress);
        hcc.setTotalEmployee(hccTotalEmployee);
        hcc.setSalesAmt(hccSalesAmt);
        hcc.setPropertyAmt(hccPropertyAmt);
        hcc.setDebtAmt(hccDebtAmt);
        hcc.setCapitalAmt(hccPropertyAmt, hccDebtAmt);

        // 엘지화학
        String lgChemName                  = String.valueOf("LG화학");
        String lgChemCompanyProperty       = String.valueOf("화학");
        String lgChemHeadOfficeAddress     = String.valueOf("서울 영등포구 여의대로 128");
        int lgChemTotalEmployee            = 20073;
        int lgChemSalesAmt              = 286250;
        int lgChemPropertyAmt           = 340244;
        int lgChemDebtAmt               = 166406;

        lgChem.setCompanyName(lgChemName);
        lgChem.setCompanyProperty(lgChemCompanyProperty);
        lgChem.setHeadOfficeAddress(lgChemHeadOfficeAddress);
        lgChem.setTotalEmployee(lgChemTotalEmployee);
        lgChem.setSalesAmt(lgChemSalesAmt);
        lgChem.setPropertyAmt(lgChemPropertyAmt);
        lgChem.setDebtAmt(lgChemDebtAmt);
        lgChem.setCapitalAmt(lgChemPropertyAmt, lgChemDebtAmt);

        // 롯데케미칼
        String lochemName                   = String.valueOf("롯데케미칼");
        String lochemCompanyProperty        = String.valueOf("화학");
        String lochemHeadOfficeAddress      = String.valueOf("서울특별시 송파구 올림픽로 300, 롯데월드타워 14F~16F");
        int lochemTotalEmployee             = 4540;
        int lochemSalesAmt               	= 151234;
        int lochemPropertyAmt            	= 200431;
        int lochemDebtAmt                	= 59899;

        lotteChemical.setCompanyName(lochemName);
        lotteChemical.setCompanyProperty(lochemCompanyProperty);
        lotteChemical.setHeadOfficeAddress(lochemHeadOfficeAddress);
        lotteChemical.setTotalEmployee(lochemTotalEmployee);
        lotteChemical.setSalesAmt(lochemSalesAmt);
        lotteChemical.setPropertyAmt(lochemPropertyAmt);
        lotteChemical.setDebtAmt(lochemDebtAmt);
        lotteChemical.setCapitalAmt(lochemPropertyAmt, lochemDebtAmt);

        // 엘지전자
        String lgEName                      = String.valueOf("LG전자");
        String lgEProp                      = String.valueOf("전자");
        String lgEAddress                   = String.valueOf("서울시 영등포구 여의대로 128 LG트윈타워");
        int lgETotalEmployee                = 39765;
        int lgESalesAmt                  	= 286544;
        int lgEPropertyAmt               	= 448598;
        int lgEDebtAmt                   	= 284347;

        lgElectronics.setCompanyName(lgEName);
        lgElectronics.setCompanyProperty(lgEProp);
        lgElectronics.setHeadOfficeAddress(lgEAddress);
        lgElectronics.setTotalEmployee(lgETotalEmployee);
        lgElectronics.setSalesAmt(lgESalesAmt);
        lgElectronics.setPropertyAmt(lgEPropertyAmt);
        lgElectronics.setDebtAmt(lgEDebtAmt);
        lgElectronics.setCapitalAmt(lgEPropertyAmt, lgEDebtAmt);

        // 삼성전자
        String samElecName                  = String.valueOf("삼성전자");
        String samElecProp                  = String.valueOf("전자");
        String samElecAddress               = String.valueOf("경기도 수원시 영통구 삼성로 129");
        int samElecTotalEmployee            = 106461;
        int samElecSalesAmt              	= 1547000;
        int samElecPropertyAmt           	= 3017521;
        int samElecDebtAmt               	= 872607;

        samElec.setCompanyName(samElecName);
        samElec.setCompanyProperty(samElecProp);
        samElec.setHeadOfficeAddress(samElecAddress);
        samElec.setTotalEmployee(samElecTotalEmployee);
        samElec.setSalesAmt(samElecSalesAmt);
        samElec.setPropertyAmt(samElecPropertyAmt);
        samElec.setDebtAmt(samElecDebtAmt);
        samElec.setCapitalAmt(samElecPropertyAmt, samElecDebtAmt);

        // sk하이닉스
        String skhName                      = String.valueOf("SK하이닉스");
        String skhProp                      = String.valueOf("전자");
        String skhAddress                   = String.valueOf("경기도 이천시 부달읍 경청대로 2091");
        int skhTotalEmployee                = 28482;
        int skhSalesAmt                  	= 253000;
        int skhPropertyAmt               	= 322160;
        int skhDebtAmt                   	= 168462;

        skhynix.setCompanyName(skhName);
        skhynix.setCompanyProperty(skhProp);
        skhynix.setHeadOfficeAddress(skhAddress);
        skhynix.setTotalEmployee(skhTotalEmployee);
        skhynix.setSalesAmt(skhSalesAmt);
        skhynix.setPropertyAmt(skhPropertyAmt);
        skhynix.setDebtAmt(skhDebtAmt);
        skhynix.setCapitalAmt(skhSalesAmt, skhDebtAmt);

        System.out.println(hcc.toString());
        System.out.println(lgChem.toString());
        System.out.println(lotteChemical.toString());
        System.out.println(lgElectronics.toString());
        System.out.println(samElec.toString());
        System.out.println(skhynix.toString());
    }

}
