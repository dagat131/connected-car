package exam05;

public class Ex05Example {

	public static void main(String[] args) {
		Ex05 e1 = new Ex05("ȫ�浿", 90, 80, 70);
                      //EX05 �� ������
		System.out.println(e1.name);
		System.out.println(e1.kor);
		System.out.println(e1.eng);
		System.out.println(e1.mat);
		System.out.println(e1.tot);
		System.out.println(e1.avg);
		
		Ex05 e2 = new Ex05("��ö��", 60, 70, 70);
		Ex05 e3 = new Ex05("�̿���", 90, 50, 90);
		Ex05 e4 = new Ex05("ȫ����", 100, 80, 80);
		
		System.out.println(e2.name);
		System.out.println(e2.kor);
		System.out.println(e2.eng);
		System.out.println(e2.mat);
		System.out.println(e2.tot);
		System.out.println(e2.avg);
	}

}
