package exam24;

import java.io.File;

public class InfoExample {

	public static void main(String[] args) {
		File myObj = new File("test.txt");
		if (myObj.exists()) {
			System.out.println("File Name : " + myObj.getName());   //이름
			System.out.println("Absolute path : " + myObj.getAbsolutePath());    //파일위치
			System.out.println("Writeable : " + myObj.canWrite());  // 트루는 쓸수있는 권한 있다. 폴스는 안된다.
			System.out.println("Readable : " + myObj.canRead());    // 트루는 읽을수있는 권한 있다. 폴스는 안된다.
			System.out.println("File size in bytes " + myObj.length());   //파일 용량크기
		} else { 
			System.out.println("The file dose not exists.");
		}
		
	}

}
