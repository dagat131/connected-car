package day06;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int a = in.nextInt();
		
		int i = 0;
		int sum = 0; 
		
		while (i < 10) {
			i ++ ;
			sum += a;
			System.out.println(i + ", �հ� : " + sum);
			
			
			
		}
		System.out.println("�� �հ� : " + sum);
		
		
		/* for(�ʱⰪ; ��������; ����ġ){

	}
		*/
		}
}

