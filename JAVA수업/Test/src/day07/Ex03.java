package day07;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* 배열(array)
		 * 타입변수
		 * String s = "a";
		 * String b = 1; <- 에러발생
		 * int c = 5;
		 * int d = "6";  <- 에러발생
		 * 
		 * 타입 배열변수 = "1","asfd","2"   <-- 하나의 변수에 여러 변수가 들어간다.
		 * 
		 * 
		 * 1. 타입 선언[갯수] 선언할때 갯수를 말함
		 * 2. 타입이 같아야한다.
		 */
//
//		String[] cars1 = {"Volvo","BMW","Ford","Mazda"}; //배열의 단점. 선언을 한 후엔 배열 수를 수정 불가함
//		System.out.println(cars1[0]);
//		System.out.println(cars1[1]);		
//		System.out.println(cars1[2]);					// cars1의 변수안에 있는 인덱스 순서대로 출력해줌.
//		System.out.println(cars1[3]);
////		System.out.println(cars1[4]);					// 4번째 인덱스는 없어서 오류가남
//		
//		int[] myNum = {10, 20, 30, 40}; // 4개
//		System.out.println(myNum[0]);
//		System.out.println(myNum[1]);
//		System.out.println(myNum[2]);
//		System.out.println(myNum[3]);
//	
////		int[] myNum2 = {1,2,3,4,"5"};   //"5"가 문자열 타입이라서 오류가뜸
//		
//		int[] myNum3 = new int[7];  //선언 및 생성
//		//{?, ?, ?, ?, ?, ?, ?}
//		myNum3[0] = 1;				// 배열안에 넣는법 첫번째
//		myNum3[1] = 2;
//		myNum3[2] = 3;
//		myNum3[3] = 4;
//		myNum3[4] = 5;
//		myNum3[5] = 6;
//		myNum3[6] = 7;
//		System.out.println(myNum3[3]);
//		
//		int[] myNum4 = new int[] {10,20,30,40,50}; 		// 배열안에 넣는법 두번째
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
//		System.out.println(myNum4[2]);  //100으로 바뀜
		
		//5개 상품구매, 상품이름/가격
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
//			System.out.println("상품, 가격을 입력하세요 : ");	
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
//		prin += "\n합계" + "\t" + sum;
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
