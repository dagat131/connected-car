package day06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = grade.nextLine();
		System.out.println("국어 : ");
		int gug = grade.nextInt();
		
		System.out.println("영어 : ");
		int eng = grade.nextInt();
		
		System.out.println("수학 : ");
		int math = grade.nextInt();
		
		//-----------------------------
		
		//처리 -------------------------
		int all = gug + math + eng;
		System.out.println("총점 : " + all);
		
		double all2 = all / 3.0;
		System.out.println("평균 : " + Math.round(all2));
		// ----------------------------
		
		
		String all3 = "";
		switch((int)all2 / 10) {
			case 10:
				all3 = "A";
				break;
			case 9: 			
				all3 = "A";
				break;
			case 8:
				all3 = "B";
				break;
			case 7:
				all3 = "C";
				break;
			case 6:
				all3 = "D";
				break;
			default:
				all3 = "F";
				break;
		}
				
		String prinValue = "";
		prinValue += "============================================================\n";
		prinValue += "이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\t" + "등급\n";
		prinValue += "============================================================\n";
		prinValue += name + "\t" + gug + "\t" + eng + "\t" + math + "\t" + all + "\t" + Math.round(all2) + "\t" + all3+ "\n";
		prinValue += "============================================================\n";
		
		System.out.println(prinValue);
		}
	}


