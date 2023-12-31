package lec08.jth.world;

import lec08.jth.world.machine.SetInfo;

import java.util.Scanner;


// 객체 지향의 묘미: 이미 정의된 기능을 재활용할 수 있다!!
public class MainMethod {

    public static void main(String[] args) {
    	
    	// 1. setInfo 객체 가져오기
        SetInfo setInfo = new SetInfo();
        
        // 2. setInfo 세팅
        setInfo.setCompanyInfo();

        // 3. 스캐너 선언
        Scanner scanner = new Scanner(System.in);

        boolean isLoopContinue = true;
        while (isLoopContinue) {

            System.out.println("회사명은?");
            String scanNext = scanner.next();

            // 4. toLowerCase(): 소문자로 변경
            String lowerScanNext = scanNext.toLowerCase();
            System.out.println(lowerScanNext);
            
            
            // 5. whatCompanyChoose 실행
            // 5_1. 3가지 파라미터를 받아 회사 종류, 정보 종류 정의 후 showCompanyInfo 실행
            // 5_2. 파라미터로 받은 kindCompany, resultKindInfo 에 맞는 정보 출력
            // 
            whatCompanyChoose(lowerScanNext, setInfo, scanner);
            System.out.println("종료하시겠습니까? 종료면 1을 아니면 아무 숫자나 입력하세요.");
            int result = scanner.nextInt();
            if (result == 1) {
                isLoopContinue = false;
                System.out.println("종료되었습니다.");
            }
        }
    }

    // 3가지 파라미터를 받아 회사 종류, 정보 종류 정의 후 showCompanyInfo 실행
    public static void whatCompanyChoose(String lowerScanNext, SetInfo setInfo, Scanner scanner) {

        int kindCompany         = 0;     // 회사 종류
        int resultKindInfo      = 0;     // 선택한 정보 종류

        if (lowerScanNext.contains("한화솔")) {
            System.out.println("한화솔루션케미칼 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 1;
        } else if (lowerScanNext.contains("lg화")) {
            System.out.println("엘지화학 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 2;
        } else if (lowerScanNext.contains("롯데케")) {
            System.out.println("롯데케미칼 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 3;
        } else if (lowerScanNext.contains("lg전")) {
            System.out.println("엘지전자 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 4;
        } else if (lowerScanNext.contains("삼성전")) {
            System.out.println("삼성전자 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 5;
        } else if (lowerScanNext.contains("sk하")) {
            System.out.println("에스케이하이닉스 정보를 선택하셨습니다.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setInfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 6;
        }

        showCompanyInfo(kindCompany, resultKindInfo, setInfo);
    }
    
    public static int askWhatTypeAnswerWant(Scanner scanner, SetInfo setInfo) {
        System.out.println("어떤 정보를 원하세요?");
        System.out.println("1번 회사명");
        System.out.println("2번 회사주력사업");
        System.out.println("3번 회사위치");
        System.out.println("4번 총 인원");
        System.out.println("5번 매출액");
        System.out.println("6번 자산액");
        System.out.println("7번 부채액");
        System.out.println("8번 자본액");

        String chooseAnswerType = scanner.next();
        
        // trim(): 양 옆 공백 없애기
        chooseAnswerType = chooseAnswerType.trim();

        int chsaType = 0;

        try {
        	
        	// Integer.parseInt(): String -> Int 형변환
            chsaType = Integer.parseInt(chooseAnswerType);
        } catch (Exception e) {
            System.out.println("잘못된 동작으로 프로그램을 종료합니다.");
            System.out.println("숫자만 입력하셔야 합니다.");
        }

        return chsaType;
    }

    
    // 파라미터로 받은 kindCompany, resultKindInfo 에 맞는 정보 출력
    public static void showCompanyInfo(int kindCompany, int resultKindInfo, SetInfo setInfo) {
        switch (kindCompany) {
            case 1 :
                System.out.println("한화솔루션케미칼입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.hcc.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.hcc.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.hcc.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.hcc.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmt = setInfo.hcc.getSalesAmt();
                        System.out.println("회사 매출액 : " + intSalesAmt);
                        break;
                    case 6 :
                        int intPropertyAmt = setInfo.hcc.getPropertyAmt();
                        System.out.println("회사 자산액 : " + intPropertyAmt);
                        break;
                    case 7 :
                        int intDebtAmt = setInfo.hcc.getDebtAmt();
                        System.out.println("회사 부채액 : " + intDebtAmt);
                        break;
                    case 8 :
                        int intCapitalAmt = setInfo.hcc.getCapitalAmt();
                        System.out.println("회사 자본액 : " + intCapitalAmt);
                        break;
                }

                break;
            case 2 :
                System.out.println("LG화학입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.lgChem.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.lgChem.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.lgChem.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.lgChem.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmt = setInfo.lgChem.getSalesAmt();
                        System.out.println("회사 매출액 : " + intSalesAmt);
                        break;
                    case 6 :
                        int intPropertyAmt = setInfo.lgChem.getPropertyAmt();
                        System.out.println("회사 자산액 : " + intPropertyAmt);
                        break;
                    case 7 :
                        int intDebtAmt = setInfo.lgChem.getDebtAmt();
                        System.out.println("회사 부채액 : " + intDebtAmt);
                        break;
                    case 8 :
                        int intCapitalAmt = setInfo.lgChem.getCapitalAmt();
                        System.out.println("회사 자본액 : " + intCapitalAmt);
                        break;
                }
                break;
            case 3 :
                System.out.println("롯데케미칼입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.lotteChemical.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.lotteChemical.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.lotteChemical.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.lotteChemical.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmt = setInfo.lotteChemical.getSalesAmt();
                        System.out.println("회사 매출액 : " + intSalesAmt);
                        break;
                    case 6 :
                        int intPropertyAmt = setInfo.lotteChemical.getPropertyAmt();
                        System.out.println("회사 자산액 : " + intPropertyAmt);
                        break;
                    case 7 :
                        int intDebtAmt = setInfo.lotteChemical.getDebtAmt();
                        System.out.println("회사 부채액 : " + intDebtAmt);
                        break;
                    case 8 :
                        int intCapitalAmt = setInfo.lotteChemical.getCapitalAmt();
                        System.out.println("회사 자본액 : " + intCapitalAmt);
                        break;
                }
                break;
            case 4 :
                System.out.println("LG전자입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.lgElectronics.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.lgElectronics.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.lgElectronics.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.lgElectronics.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmt = setInfo.lgElectronics.getSalesAmt();
                        System.out.println("회사 매출액 : " + intSalesAmt);
                        break;
                    case 6 :
                        int intPropertyAmt = setInfo.lgElectronics.getPropertyAmt();
                        System.out.println("회사 자산액 : " + intPropertyAmt);
                        break;
                    case 7 :
                        int intDebtAmt = setInfo.lgElectronics.getDebtAmt();
                        System.out.println("회사 부채액 : " + intDebtAmt);
                        break;
                    case 8 :
                        int intCapitalAmt = setInfo.lgElectronics.getCapitalAmt();
                        System.out.println("회사 자본액 : " + intCapitalAmt);
                        break;
                }
                break;
            case 5 :
                System.out.println("삼성전자입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.samElec.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.samElec.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.samElec.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.samElec.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmt = setInfo.samElec.getSalesAmt();
                        System.out.println("회사 매출액 : " + intSalesAmt);
                        break;
                    case 6 :
                        int intPropertyAmt = setInfo.samElec.getPropertyAmt();
                        System.out.println("회사 자산액 : " + intPropertyAmt);
                        break;
                    case 7 :
                        int intDebtAmt = setInfo.samElec.getDebtAmt();
                        System.out.println("회사 부채액 : " + intDebtAmt);
                        break;
                    case 8 :
                        int intCapitalAmt = setInfo.samElec.getCapitalAmt();
                        System.out.println("회사 자본액 : " + intCapitalAmt);
                        break;
                }
                break;
            case 6 :
                System.out.println("SK하이닉스입니다.");
                switch (resultKindInfo) {
                    case 1 :
                        String strCompanyName = setInfo.skhynix.getCompanyName();
                        System.out.println("회사명 : " + strCompanyName);
                        break;
                    case 2 :
                        String strCompanyProperty = setInfo.skhynix.getCompanyProperty();
                        System.out.println("회사 사업 분야 : " + strCompanyProperty);
                        break;
                    case 3 :
                        String strHeadOfficeAddress = setInfo.skhynix.getHeadOfficeAddress();
                        System.out.println("회사 주소 : " + strHeadOfficeAddress);
                        break;
                    case 4 :
                        int intTotalEmployee = setInfo.skhynix.getTotalEmployee();
                        System.out.println("회사 총인원 : " + intTotalEmployee);
                        break;
                    case 5 :
                        int intSalesAmt = setInfo.skhynix.getSalesAmt();
                        System.out.println("회사 매출액 : " + intSalesAmt);
                        break;
                    case 6 :
                        int intPropertyAmt = setInfo.skhynix.getPropertyAmt();
                        System.out.println("회사 자산액 : " + intPropertyAmt);
                        break;
                    case 7 :
                        int intDebtAmt = setInfo.skhynix.getDebtAmt();
                        System.out.println("회사 부채액 : " + intDebtAmt);
                        break;
                    case 8 :
                        int intCapitalAmt = setInfo.skhynix.getCapitalAmt();
                        System.out.println("회사 자본액 : " + intCapitalAmt);
                        break;
                }
                break;
            default:
                System.out.println("올바른 값을 선택하세요.");
                break;
        }
    }

}
