package exam10;

public class exam01 {

	static int i = 15;  //��������. ����ƽ�� ������ �ǹ̵� �ֱ⶧���� �����̵ȴ�.
	
	static void ppp() {
		++i;
		System.out.println(i);
	}
	
	static void qqq() {
		i = i + 5;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
			System.out.println(i);
			ppp();
			qqq();
			System.out.println(i);
			
	}

}
