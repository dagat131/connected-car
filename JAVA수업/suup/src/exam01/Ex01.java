package exam01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//�������� -> Ư�� ��(�߰�ȣ) �ȿ��� ���� �Ǵ°�
		//�������� -> ���� ������� ��ü���� ����Ǵ°�
		//�迭 : �ϳ��� ������ �������� ���� ��°�.
		//  ==> ����1 : Ÿ���� �����͸� ���� �� �ִ�.
		//  ==> ����2 : ũ�⸦ �̸� ������ �Ѵ�.
		
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
			System.out.println("���� : ");
			gug = scan.nextInt();
			System.out.println("���� : ");
			math = scan.nextInt();
			System.out.println("���� : ");
			eng = scan.nextInt();
			
			all = gug + math + eng;
			avg = (double)all / 3; 
			sp = name + "," + gug + "," + math + "," + eng + "," + all + "," + avg;
			array[i] = sp;
			System.out.println(array[i]);
			
		}	
		System.out.println("=========================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println("=========================================");
		String imsi[] = array;
		for(int i = 0; i < array.length; i++) {
			imsi = array[i].split(",");
			System.out.println(imsi[0]+"\t" + imsi[1] + "\t" + imsi[2] + "\t" + imsi[3] + "\t" + imsi[4] + "\t" + imsi[5]);
	}

	}
}
