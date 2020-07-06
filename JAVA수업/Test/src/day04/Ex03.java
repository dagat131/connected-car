package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ex03 {

// ## BufferedReader / 인풋 입력방법 2
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("이름을 입력하세요 : ");
		String name = in.readLine(); // ## 예외처리 선택해줄것.!	
		
		System.out.println("나이를 입력하세요 : ");
		String age = in.readLine(); // ## 예외처리 선택해줄것.!	
		
	}

}
