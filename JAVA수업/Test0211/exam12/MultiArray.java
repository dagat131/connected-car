package exam12;

public class MultiArray {

	public static void main(String[] args) {
		//array
		//int[] a = new int[5];
		//int[] a; //1차원
		//int [][] aa; //2차원
		//int [][][] aaa//3차원
		
		int[][] ar1 = new int[3][4];  // 2차원배열선언
		int[][] ar2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //3행 4열, 선언 및 초기화
		System.out.println(ar2); //주소가 나온다
		System.out.println(ar2[1]); // 1행에 대한 주소가 나온다.
		System.out.println(ar2[1][1]); //값이 나온다.
		System.out.println(ar2[2][1]);
		
		ar1[1][1] = 5;
		ar2[1][3] = 100;
		
		for(int i = 0; i<ar2.length; i++) {
			for (int j = 0; j<ar2[i].length; j++) {
				System.out.println(ar2[i][j] + " ");
			}System.out.println();
			}
		
		/* 클래스 배열(객체 배열)
		 * 
		 * int[] a = new int[5];
		 * Person[] p = new Person[5];
		 *   펄슨이란 클래스에 생성. 
		 *
		 */
	
	}

}
