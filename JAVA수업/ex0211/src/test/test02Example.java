package test;

import java.util.ArrayList;
import java.util.Scanner;

public class test02Example {

	public static void main(String[] args) {
		ArrayList<test02> arrayList = new ArrayList<test02>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. �л���ȸ,  2. �л����,  3. ����");
			
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
