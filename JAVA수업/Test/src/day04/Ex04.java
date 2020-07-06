package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("이름, 성별, 주민번호를 입력하세요.");
//		
//		String name = in.readLine();
//		String sex = in. readLine();
//		String num = in. readLine();
//		
//		System.out.println("당신의 이름은 " + name + " 입니다.");
//		System.out.println("당신의 성별은 " + sex + " 입니다.");
//		System.out.println("당신의 주민번호는 " + num + " 입니다.");
//		
		String s = "abcdefg";
		System.out.println(s);
		
		String t = s.substring(3,6);
		System.out.println(t);
	}

}
