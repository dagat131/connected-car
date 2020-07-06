package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름, 주민번호를 입력하세요.");
		
		String name = in.readLine();
		String num = in. readLine();
		
		System.out.println(name + "입니다.");
		
		String nums = num.substring(6,7);
		nums = (nums.contentEquals("1") || nums.contentEquals("3")     ) ? "남자" : "여자";
		System.out.println(nums + "입니다");
		
		String numw = num.substring(0,2);
		int numww = Integer.parseInt(numw);
		numww = 2020 - (1900+numww);
		System.out.println(numww);
			
		String locals = num.substring(7,8);
		int localss = Integer.parseInt(locals);
		
		String local3 = (localss==1) ? "서울" :  (localss==2) ? "경기도" : (localss==3) ? "강원도" : (localss==4) ? 
				"충청북도" : (localss==5) ? "충청남도" : (localss==6) ? "대구광역시" : (localss==7) ? 
				"경상북도" : (localss==8) ? "경상남도" : "부산광역시" ;
		System.out.println(local3);
		
		
		String prnvalue = "";
		System.out.println(prnvalue);
		
//		System.out.println("당신의 이름은 " + name + " 입니다.");
//		System.out.println("당신의 성별은 "+ nums + " 입니다.");
//		System.out.println("당신의 나이는 " + numww + " 입니다.");
//		System.out.println("당신의 지역은 " + local3 + " 입니다.");
//		


	}

}
