package exam24;

import java.io.File;

public class InfoExample {

	public static void main(String[] args) {
		File myObj = new File("test.txt");
		if (myObj.exists()) {
			System.out.println("File Name : " + myObj.getName());   //�̸�
			System.out.println("Absolute path : " + myObj.getAbsolutePath());    //������ġ
			System.out.println("Writeable : " + myObj.canWrite());  // Ʈ��� �����ִ� ���� �ִ�. ������ �ȵȴ�.
			System.out.println("Readable : " + myObj.canRead());    // Ʈ��� �������ִ� ���� �ִ�. ������ �ȵȴ�.
			System.out.println("File size in bytes " + myObj.length());   //���� �뷮ũ��
		} else { 
			System.out.println("The file dose not exists.");
		}
		
	}

}
