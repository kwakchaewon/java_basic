package lec15.fileIO05.training01;

import java.io.File;
import java.util.Date;

public class FileManyFunction01 {
	public static void main(String[] args) throws Exception{
		
		File txtFile = new File("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\FileIOTextFile.txt");
		File txtFolder = new File("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\FileIOFolder");
		
		// getName(): 경로 중 파일 이름 반환
		String fileNmae=txtFile.getName();
		System.out.println("fileName : " + fileNmae);
		
		// lastModified((): 수정된 날짜
		long longLastModified = txtFile.lastModified();
		System.out.println("longLastModified : " + longLastModified);
		Date dateLastModified = new Date(longLastModified);
		System.out.println("dateLastModified : " + dateLastModified);
	
		// getPath(): 객체 생성시 파일 경로 (가장 많이 씀)
		String filePath = txtFile.getPath();
		System.out.println("filePath : " + filePath);
		
		// getAbsolutePath(): 파일 절대 경로
		String fileAbsolutePath = txtFile.getAbsolutePath();
		System.out.println("fileAbsolutePath : " + fileAbsolutePath);
		
		// getCanonicalPath(): 파일시스템 절대 경로 반환
		String fileCanonicalPath = txtFile.getCanonicalPath();
		System.out.println("fileCanonicalPath : " + fileCanonicalPath);
		
		// exists(): 파일 존재여부
		boolean fileExist = txtFile.exists();
		System.out.println("fileExist : " + fileExist);
		
		// isFile(): 파일인가?
		boolean isFile = txtFile.isFile();
		System.out.println("isFile : " + isFile);
		
		// txtFile.list(): 지정된 폴더의 파일 및 하위 디렉토리의 이름을 문자열 배열로 반환 (없을 경우 null 반환)
		String [] txtFileList = txtFile.list();
		System.out.println("txtFileList : " + txtFileList);
		
		// 폴더 내 파일 출력
		String [] txtFolderList = txtFolder.list();	
		for (int i = 0; i < txtFolderList.length; i++) {
			System.out.println(txtFolderList[i]);
		}
		
		// mkdir(): 디렉토리 생성
		// mkdirs(): 중간에 필요한 디렉토리 모두 생성
		File newDir = new File("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\FileIOFolder\\newfolder");
		boolean mkdir = newDir.mkdir();
		System.out.println("mkdir : " + mkdir);
		
		// createNewFile(): 파일 생성
		File txtNewFileCreate = new File("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\FileIOFolder\\newfolder\\new.txt");
		boolean newFile = txtNewFileCreate.createNewFile();
		System.out.println("newFile : " + newFile);
		
		// renameTo(): 파일명 변경
		File renameTo = new File("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\FileIOFolder\\newfolder\\new2.txt");
		boolean reNameFile = txtNewFileCreate.renameTo(renameTo);
		System.out.println("reNameFile : " + reNameFile);
		
		// delete(): 파일 및 디렉토리 삭제
		File deleteFile = new File("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\FileIOFolder\\newfolder\\new2.txt");
		boolean tfDelte = deleteFile.delete();
		System.out.println("tfDelte " + tfDelte);
		
		// getFreeSpace(): 사용 가능 용량
		// getTotalSpace(): 총 용량
		long freeSpace = txtFile.getFreeSpace();
		System.err.println("freeSpace  : " + freeSpace);
		long freeSpaceGB = (((freeSpace/1024)/1024)/1024);
		System.out.println("freeSpaceGB : " + freeSpaceGB);
		
		
		
		
		
		
		
		
	}
}
