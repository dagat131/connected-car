package day06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		for (int i = 0; i < 99; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 10; i > 0;) {
//			System.out.println(i);
//			i = i -1;
//		}
//		for (int i = 0; i < 10;i = i + 1) {
//			if ( i == 4 ) {
//				continue;
//			}
//			System.out.println(i);
		
		/*
		for(�ʱⰪ;������;������) {
		
		}
		*/
		
//		
//		int t = 0;
//		for (int a = 1; a <= 5; a++) {
//			t = t + a;
//			System.out.println(a + "����, " + "�ȳ��ϼ���");
////			System.out.println(a);      //for�� �ȿ��� �νĵ�
//		}
//		System.out.println();
//		System.out.println(t);          //for�� �ٱ����� ������ �ν���������
//		
//		//�������� , ��������

		//������ 3��
		
//		int i = 1;
//		i = i * 1;
//		for (i = i; i < 10; i++) {
//			int k = 3 * i;
//			System.out.println("3 * " + i + " = " + k);
//			
		//������ 7��
//		int i = 1;
//		i = i * 1;
//		for (i = i; i < 10; i++) {
//			int k = 7 * i;
//			System.out.println("7 * " + i + " = " + k);
		
		//������ 9��
//		Scanner gugudan = new Scanner(System.in);
//		System.out.println("�ܼ��� �Է��ϼ��� : ");
//		int a = gugudan.nextInt();
//		
//		for (int i = 1; i < 10; i = i + 1) {
//			int k = a * i;
//			if (i%3 == 0) { //3�� ��� ���ϱ�
//				System.out.println(a + " * " + i + " = " + k);
//			}
				
//			System.out.println(a + " * " + i + " = " + k);
			
		Scanner gugudan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int a = gugudan.nextInt();
		
		int a2=0;
		int a3=0;
		for (int a1 = 1; a1 <= a; a1 = a1 + 1) {
			

			if (a1 % 2 == 0) {
				a2+=a1;
//				System.out.println("¦���� �� : " + a2);
			}
			else if (a1 % 2 != 0) {
				a3+=a1;
//				System.out.println("Ȧ���� �� : " + a3);

			}
		}
		System.out.println("¦���� �� : " + a2);
		System.out.println("Ȧ���� �� : " + a3);
		int a4 = a2 + a3;
		System.out.println("���հ� : " +  a4);
	}
}
		

	


