package exam21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HashMap<String, String>> people = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			HashMap<String, String> grade = new HashMap<String, String>();

			System.out.println("성적을 입력하세요  ");

			System.out.println("name : ");
			String name = null;
			name = input.next();

			System.out.println("kor : ");
			String kor = null;
			kor = input.next();

			System.out.println("mat : ");
			String mat = null;
			mat = input.next();

			System.out.println("eng : ");
			String eng = null;
			eng = input.next();

			System.out.println("gug : ");
			String gug = null;
			gug = input.next();

			int all = Integer.parseInt(kor) + Integer.parseInt(mat) + Integer.parseInt(eng)
						+ Integer.parseInt(gug); 
			int avr = all / 4;
			String sum = ""+all;  // 문자열 + int 는 문자열로 전환됨.
			String avg = ""+avr;
			
			grade.put("name", name);
			grade.put("kor", kor);
			grade.put("mat", mat);
			grade.put("eng", eng);
			grade.put("gug", gug);
			grade.put("all", sum);
			grade.put("avr", avg);
			
			
			people.add(i, grade);
		}
		System.out.println(people);

		for (int i = 0; i < people.size(); i++) {
			System.out.print(people.get(i).get("name") + "\t");
			System.out.print(people.get(i).get("kor") + "\t");
			System.out.print(people.get(i).get("mat") + "\t");
			System.out.print(people.get(i).get("eng") + "\t");
			System.out.print(people.get(i).get("all") + "\t");
			System.out.println(people.get(i).get("avr") + "\t");
		}

	}

}
