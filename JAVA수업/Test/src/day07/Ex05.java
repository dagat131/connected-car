package day07;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String sp; // , �� �迭�� ���ø��ϱ����� ����
		int gug;
		int math;
		int eng;
		
		int all;
		double avg;
		String[] array = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("name:");
			name = scan.next();
			System.out.println("���� : ");
			gug = scan.nextInt();
			System.out.println("���� : ");
			math = scan.nextInt();
			System.out.println("���� : ");
			eng = scan.nextInt();
			
			all = gug + math + eng;
			avg = Math.round((double)all / 3.0); 
			sp = name + "," + gug + "," + math + "," + eng + "," + all + "," + avg;
			
			array[i] = sp;
			
		}	
		System.out.println("=========================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println("=========================================");
		String imsi[] = array;
		for(int i = 0; i < 3; i++) {
			imsi = array[i].split(",");
			System.out.println(imsi[0]+"\t" + imsi[1] + "\t" + imsi[2] + "\t" + imsi[3] + "\t" + imsi[4] + "\t" + imsi[5]);
			
		}
		
	}
}
