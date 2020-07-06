package test04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 : 조회 , 2 : 등록 , 기타 : 종료 :");
			
			String scan = input.next();
			if(scan.contentEquals("1")) {
				System.out.println("이름" + "\t" + "국어" + "\t" + "영어"+ "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
				for (int i = 0; i < arrayList.size(); i++) {
					arrayList.get(i).disp();
				}
			}else if(scan.contentEquals("2")) {
				Student student = new Student();
				student.input();
				arrayList.add(student);
			}else {
				break;
			}
			
			
		}System.out.println("---프로그램 종료---");
		

	}

}
