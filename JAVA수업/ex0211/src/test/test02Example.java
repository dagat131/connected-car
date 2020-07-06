package test;

import java.util.ArrayList;
import java.util.Scanner;

public class test02Example {

	public static void main(String[] args) {
		ArrayList<test02> arrayList = new ArrayList<test02>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 학생조회,  2. 학생등록,  3. 종료");
			
			String scan = input.next();
			if(scan.contentEquals("1")) {
				
				
				for (int i = 0; i < arrayList.size(); i++) {
					arrayList.get(i).disp();
				}
			}
			else if(scan.contentEquals("2")) {
				test02 a = new test02();
				a.input();
				arrayList.add(a);
			}else {
				break;
			}
		}
			
		
		System.out.println("---- the end ----");
		
	
	}

}
