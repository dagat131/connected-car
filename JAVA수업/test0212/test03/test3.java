package test03;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor;
		int eng;
		int mat;
		
		int all;
		double avg;
		String sp; //배열 나누기 위한 변수
		String[] array = new String[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("이름 : ");
			name = input.next();
			System.out.println("국어 : ");
			kor = input.nextInt();
			System.out.println("영어 : ");
			eng = input.nextInt();
			System.out.println("수학 : ");
			mat = input.nextInt();
			
			all = kor + eng + mat;
			avg = (kor + eng + mat) / 3;
			sp = name + "," + kor + "," + eng + "," + mat + "," + all + "," + avg + "," ;
			
			array[i] = sp;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		String imsi[] = array;
		for(int i = 0; i<3; i++) {
			 imsi = array[i].split(",");
			System.out.println(imsi[0]+"\t" + imsi[1] + "\t" + imsi[2] + "\t" + imsi[3] + "\t" + imsi[4] + "\t" + imsi[5]);
		}
	}

}
