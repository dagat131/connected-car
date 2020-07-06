package test01;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("아이디와 비밀번호를 입력하세요 : ");
		String dbId = "hong";
		String dbPwd = "h1234";
		
		System.out.println("ID : ");
		String inputID = input.next();
		System.out.println("Pwd : ");
		String inputPwd = input.next();
		
		
		if (inputID.contentEquals("hong")) {
			System.out.println("일치");
		}	if (inputPwd.contentEquals("h1234")) {
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}
		
		
	}

}
