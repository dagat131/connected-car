package exam14;

public class ChildExample {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		System.out.println(p.a);
//		System.out.println(p.name);
		
		Child c = new Child();
		System.out.println(c.b);
		
		System.out.println(c.a);    // ������. �ڽİ����� ���������� ���� ������ ������ ���� �����ǵ�.
		System.out.println(c.name);   //��ӹ޾ұ� ������ ��밡��.
		
		c.method1();  //�޼ҵ� ������  / �θ�, �����̸��� ���� ���� �ٲٴ� ���� ������
		
	}

}
