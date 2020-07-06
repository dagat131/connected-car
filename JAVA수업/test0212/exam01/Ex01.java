package exam01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//지역변수 -> 특정 블럭(중괄호) 안에서 실행 되는것
		//전역변수 -> 블럭에 상관없이 전체에서 실행되는것
		//배열 : 하나의 변수에 여러개의 값을 담는것.
		//  ==> 조건1 : 타입이 같은것만 담을 수 있다.
		//  ==> 조건2 : 크기를 미리 만들어야 한다.
		
		Scanner scan = new Scanner(System.in);
		String name;
		String sp;
		int gug;
		int math;
		int eng;
		
		int all;
		double avg;
		String[] array = new String[3];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("name:");
			name = scan.next();
			System.out.println("국어 : ");
			gug = scan.nextInt();
			System.out.println("수학 : ");
			math = scan.nextInt();
			System.out.println("영어 : ");
			eng = scan.nextInt();
			
			all = gug + math + eng;
			avg = (double)all / 3; 
			sp = name + "," + gug + "," + math + "," + eng + "," + all + "," + avg;
			array[i] = sp;
			System.out.println(array[i]);
			
		}	
		System.out.println("=========================================");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		System.out.println("=========================================");
		String imsi[] = array;
		for(int i = 0; i < array.length; i++) {
			imsi = array[i].split(",");
			System.out.println(imsi[0]+"\t" + imsi[1] + "\t" + imsi[2] + "\t" + imsi[3] + "\t" + imsi[4] + "\t" + imsi[5]);
	}

	}
}
