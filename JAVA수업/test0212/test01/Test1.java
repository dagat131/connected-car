package test01;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���̵�� ��й�ȣ�� �Է��ϼ��� : ");
		String dbId = "hong";
		String dbPwd = "h1234";
		
		System.out.println("ID : ");
		String inputID = input.next();
		System.out.println("Pwd : ");
		String inputPwd = input.next();
		
		
		if (inputID.contentEquals("hong")) {
			System.out.println("��ġ");
		}	if (inputPwd.contentEquals("h1234")) {
			System.out.println("��ġ");
		}else {
			System.out.println("����ġ");
		}
		
		
	}

}
