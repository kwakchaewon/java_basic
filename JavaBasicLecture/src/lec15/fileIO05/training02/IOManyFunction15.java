package lec15.fileIO05.training02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOManyFunction15 {
	public static void main(String[] args) {
		
		String path = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\file3.txt");
		
		OutputStreamWriter osw = null;
		
		try {
			osw = new OutputStreamWriter(new FileOutputStream(path), "utf-8");
			osw.write("국방부 utf-8\r\n");
			osw.append("육해공 \r\n");
			osw.append("육군본부, 해군본부, 공군본부");

			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				osw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		BufferedReader bfr = null;
		
		try {
			bfr = new BufferedReader(new InputStreamReader(new FileInputStream(path),"utf-8"));
					
			while (true) {
				String strReadLine = bfr.readLine();
				if (strReadLine==null) {
					break;
				}
				System.out.println(strReadLine);
			}
		} catch (Exception e) {
			
		}
	
	}
}
