package day04;

public class Ex01 {

	public static void main(String[] args) {
		/* ��Ʈ������
		 * 10���� -> 2������ ��ȯ
		 * 
		 * 	  8 4 2 1 
		 * 5: 0 1 0 1
		 * 7: 0 1 1 1
		 * 
		 * =============
		 * 
		 * and : 0101
		 *  or : 0111
		 *   ^ : 0010
		 *   
		 * 5 and 7
		 * 5 or 7
		 * 5 ^ 7 (XOR) : �������� ������ 0, �ٸ����� ������ 1
		 * 
		 * * ���� shift
		 * 5 << 2 : 5 * (2**2) : 20
		 * 5 << 1 : 5 * (2**1) : 10
		 * 
		 * * ������ shift
		 * ������
		 */
		
		//���׿�����
		String s = (5 < 7) ? "T" : "F";
		System.out.println(s);

//		String ss = (5 < 7) ? "T" : 0;
//		System.out.println(ss);
	
		int sss = (5 < 7) ? 1 : 0;
		System.out.println(sss);

		/* ��ȣ������
		 * int a = +5;  ���� �÷����� ��ȣ������(�÷����� ���� �ڵ������� �ȴ�)
		 * int a = -5;  ���� ���̳ʽ��� ��ȣ������(���̳ʽ��� �־�����Ѵ�.)
		 */
		
		String name = "����";
		System.out.println(name);
		
		System.out.println("����� �̸��� " + name + " �Դϴ�");
		
		int agee = 28;
		System.out.println(name + " ���� ���̴� " + agee + " �� �Դϴ�.");
		
		int year = 1993;
		int age = 2020 - year;
		System.out.println("���� : " + age);
		
		year = 2000;
		age = 2020 - year;
		System.out.println("���� : " + age);
		
		
	
	}

}
