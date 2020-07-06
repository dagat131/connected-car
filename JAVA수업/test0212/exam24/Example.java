package exam24;

import java.io.File;

public class Example {

	public static void main(String[] args) {
		/* 파일처리
		 */
		try {
			File myObj = new File("test.txt");  // import 필요  // 파일이 생성됨
			
			if (myObj.createNewFile()) {
				System.out.println("File created : " + myObj.getName());
				
			} else {
				System.out.println("File already exists.");
			}
		} catch (Exception e) {
			System.out.println("An error occurred."); // 오류가 발생했습니다.
			e.printStackTrace();
		}

	}

}
