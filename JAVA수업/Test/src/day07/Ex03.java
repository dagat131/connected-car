package day07;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* �迭(array)
		 * Ÿ�Ժ���
		 * String s = "a";
		 * String b = 1; <- �����߻�
		 * int c = 5;
		 * int d = "6";  <- �����߻�
		 * 
		 * Ÿ�� �迭���� = "1","asfd","2"   <-- �ϳ��� ������ ���� ������ ����.
		 * 
		 * 
		 * 1. Ÿ�� ����[����] �����Ҷ� ������ ����
		 * 2. Ÿ���� ���ƾ��Ѵ�.
		 */
//
//		String[] cars1 = {"Volvo","BMW","Ford","Mazda"}; //�迭�� ����. ������ �� �Ŀ� �迭 ���� ���� �Ұ���
//		System.out.println(cars1[0]);
//		System.out.println(cars1[1]);		
//		System.out.println(cars1[2]);					// cars1�� �����ȿ� �ִ� �ε��� ������� �������.
//		System.out.println(cars1[3]);
////		System.out.println(cars1[4]);					// 4��° �ε����� ��� ��������
//		
//		int[] myNum = {10, 20, 30, 40}; // 4��
//		System.out.println(myNum[0]);
//		System.out.println(myNum[1]);
//		System.out.println(myNum[2]);
//		System.out.println(myNum[3]);
//	
////		int[] myNum2 = {1,2,3,4,"5"};   //"5"�� ���ڿ� Ÿ���̶� ��������
//		
//		int[] myNum3 = new int[7];  //���� �� ����
//		//{?, ?, ?, ?, ?, ?, ?}
//		myNum3[0] = 1;				// �迭�ȿ� �ִ¹� ù��°
//		myNum3[1] = 2;
//		myNum3[2] = 3;
//		myNum3[3] = 4;
//		myNum3[4] = 5;
//		myNum3[5] = 6;
//		myNum3[6] = 7;
//		System.out.println(myNum3[3]);
//		
//		int[] myNum4 = new int[] {10,20,30,40,50}; 		// �迭�ȿ� �ִ¹� �ι�°
//		System.out.println(myNum4[2]);
//		
//		System.out.println(myNum.length);
//		System.out.println(myNum3.length);
//		System.out.println(myNum4.length);
//		
//		for(int i = 0; i < cars1.length; i++) {
//			System.out.println(cars1[i]);
//		
//		System.out.println(myNum4[2]);
//		myNum4[2] = 100;
//		System.out.println(myNum4[2]);  //100���� �ٲ�
		
		//5�� ��ǰ����, ��ǰ�̸�/����
//		Scanner input = new Scanner(System.in);
//		String inputs = "";
//		int Price = 0;
//		String prin = "";
//		int sum = 0;
//		
//		String[] abc = new String[5] ; 
//		int[] bcd = new int[5] ;
//		
//		
//		
//		for(int a = 0; a < 5; a++){
//			System.out.println("��ǰ, ������ �Է��ϼ��� : ");	
//			
//			inputs = input.next();
//			Price = input.nextInt();
//			abc[a] = inputs; 
//			bcd[a] = Price;
//		
//			prin += abc[a] + "\t" + bcd[a] + "\n";
//
//			sum += bcd[a];
//			
//			
//		}
//		
//		
//		
//		prin += "\n----------------\n";
//		prin += "\n�հ�" + "\t" + sum;
//		
//		System.out.println(prin);
//		
		Scanner scan = new Scanner(System.in);
		String name;
		String price;
		String sp;
		String[] array = new String[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("name:");
			name = scan.next();
			System.out.println("price:");
			price = scan.next();
			sp = name + "~~" + price;
			array[i] = sp;
			System.out.println(array[i]);
		}
		int tot = 0;
		for (int i = 0; i < array.length; i++) {
			String[] imsi = array[i].split("~~");
			tot = tot + Integer.parseInt(imsi[1]);
		}
		System.out.println("------------------------");
		System.out.println("name \t.......\t price");
		System.out.println("------------------------");
		
		for (int i = 0; i < array.length; i++) {
			String[] imsi = array[i].split("~~");
			System.out.println(imsi[0] + " \t.....\t" + imsi[1]);
			System.out.println(imsi[0]);
		}
		System.out.println("------------------------");
		System.out.println("result \t.....\t" + tot);
		
	}
		
	}
