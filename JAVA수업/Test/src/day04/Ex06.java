package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름");
		String name = in.readLine();
		System.out.println("월급");
		String money = in.readLine();
		
		int bonus = Integer.parseInt(money)*6;
		int year = (Integer.parseInt(money)*12) + bonus;
		
		System.out.println("보너스 : " + bonus);
		System.out.println("연봉 : " + year);
		
		String prnvalue = "이름 : " + name + "\t월급 : " + money + "\t보너스 : " + bonus + "\t연봉 : " + year;
		System.out.println(prnvalue);
	}

}
