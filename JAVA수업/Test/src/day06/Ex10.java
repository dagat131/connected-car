package day06;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("라인수입력 : ");
		int a = in.nextInt();
		String b = "";
		
		
		for(int i = 1; i <= a ; i++ ) {
			b = b + "*";
			System.out.println(b);
		}
		
		for(int i2 = a;  i2 > 0 ; i2-- ) {
			b = "";
			for(int i3 = 1; i3 <= i2; i3++) {				
				b = b + "*";
			}
			
			System.out.println(b);
		}
		
		
	}

}

