package pt01;

import java.util.ArrayList;
import java.util.Scanner;

public class studentExample {

	public static void main(String[] args) {

		ArrayList<student> arrayList = new ArrayList<student>();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("1 : 조회 , 2 : 등록 , 그외 : 종료 :");
			
			String input = scan.next();
			if (input.contentEquals("1")) {
//				System.out.println(arrayList);
				
				for (int i = 0; i < arrayList.size(); i++) {
					arrayList.get(i).disp();
				}
				
			}else if (input.contentEquals("2")) {
				student s = new student();
				s.input();
				arrayList.add(s);
			}else {
				break;
			}
	
		}System.out.println("--- 프로그램 종료  ---");

	}
}