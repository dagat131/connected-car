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
		String sp; //�迭 ������ ���� ����
		String[] array = new String[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("�̸� : ");
			name = input.next();
			System.out.println("���� : ");
			kor = input.nextInt();
			System.out.println("���� : ");
			eng = input.nextInt();
			System.out.println("���� : ");
			mat = input.nextInt();
			
			all = kor + eng + mat;
			avg = (kor + eng + mat) / 3;
			sp = name + "," + kor + "," + eng + "," + mat + "," + all + "," + avg + "," ;
			
			array[i] = sp;
		}
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		
		String imsi[] = array;
		for(int i = 0; i<3; i++) {
			 imsi = array[i].split(",");
			System.out.println(imsi[0]+"\t" + imsi[1] + "\t" + imsi[2] + "\t" + imsi[3] + "\t" + imsi[4] + "\t" + imsi[5]);
		}
	}

}
