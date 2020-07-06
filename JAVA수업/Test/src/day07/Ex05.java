package day07;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String sp; // , 를 배열로 스플릿하기위한 변수
		int gug;
		int math;
		int eng;
		
		int all;
		double avg;
		String[] array = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("name:");
			name = scan.next();
			System.out.println("국어 : ");
			gug = scan.nextInt();
			System.out.println("수학 : ");
			math = scan.nextInt();
			System.out.println("영어 : ");
			eng = scan.nextInt();
			
			all = gug + math + eng;
			avg = Math.round((double)all / 3.0); 
			sp = name + "," + gug + "," + math + "," + eng + "," + all + "," + avg;
			
			array[i] = sp;
			
		}	
		System.out.println("=========================================");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		System.out.println("=========================================");
		String imsi[] = array;
		for(int i = 0; i < 3; i++) {
			imsi = array[i].split(",");
			System.out.println(imsi[0]+"\t" + imsi[1] + "\t" + imsi[2] + "\t" + imsi[3] + "\t" + imsi[4] + "\t" + imsi[5]);
			
		}
		
	}
}
