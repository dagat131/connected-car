package exam12;

public class MultiArray {

	public static void main(String[] args) {
		//array
		//int[] a = new int[5];
		//int[] a; //1����
		//int [][] aa; //2����
		//int [][][] aaa//3����
		
		int[][] ar1 = new int[3][4];  // 2�����迭����
		int[][] ar2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //3�� 4��, ���� �� �ʱ�ȭ
		System.out.println(ar2); //�ּҰ� ���´�
		System.out.println(ar2[1]); // 1�࿡ ���� �ּҰ� ���´�.
		System.out.println(ar2[1][1]); //���� ���´�.
		System.out.println(ar2[2][1]);
		
		ar1[1][1] = 5;
		ar2[1][3] = 100;
		
		for(int i = 0; i<ar2.length; i++) {
			for (int j = 0; j<ar2[i].length; j++) {
				System.out.println(ar2[i][j] + " ");
			}System.out.println();
			}
		
		/* Ŭ���� �迭(��ü �迭)
		 * 
		 * int[] a = new int[5];
		 * Person[] p = new Person[5];
		 *   �޽��̶� Ŭ������ ����. 
		 *
		 */
	
	}

}
