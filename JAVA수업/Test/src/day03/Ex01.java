package day03;

public class Ex01 {

	public static void main(String[] args) {
		/* *����ȯ
		 * �ڵ�����ȯ : promotion, ����������ȯ
		 * ��������ȯ : Casting, ���������ȯ
		 Promotion : �� ���� Ÿ���� �� ū Ÿ���� ũ��� ��ȯ.
		 
		 */
		int myInt = 9;
		double myDouble = myInt;
		double myDouble1 = 9.78;
		int myInt1 = (int) myDouble; // (int) ���� ����ȯ
		
		
		int a = 130;
		byte b = (byte)a;
		
		long a1 = 123L;
		//long�� ���̻�� L�� �ٿ������. �׳� 123�� intŸ������ �ڵ�����ȯ�� �̷����.
		float c = 123.3f;
		// float d = (float)123.3; 
		// ���̻簡 ���� �ʴ� Ÿ���� int, double�̱� ������ d���� �ڿ� f�� �پ�����Ѵ�. ��������ȯ�� �ʿ�
		
		System.out.println(b);
		System.out.println(a1);
		
		System.out.println();
		
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myDouble1);
		System.out.println(myInt1);
	
	}

}
