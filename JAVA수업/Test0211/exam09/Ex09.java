package exam09;

public class Ex09 {
	
	//OverLoading(�����ε�) �޼ҵ��� ���� ���Ƶ� ������ �ȴ�. �Ȱ����� ������ �ִµ� ������ ��Ű�°�. ��Ʈ, ����(�ڷ���)��  �ٸ��� �����.
//	                    �޼ҵ� �����ε�  , ������ �����ε� ����
	// �Լ��̸� ���Ƶ� �ڷ����� �ٸ��� ������ ������.
	// �Ű������� �ߺ��Ǹ� �ȵȴ�., �����ڿ����ε�, �޼ҵ�����ε� 
	
	static int method(int x, int y) {
		return x + y;
	}
	static double method(double x, double y) {
		return x + y;
	}
	static double method(int x, double y) {
		return x + y;
	}
	static double method(double y, int x) {
		return x + y;
	}
	static double method(int x, int y, int z) {
		return x + y;
	}
	
	
	public static void main(String[] args) {
		int result1 = method(3,5);
		double result2 = method(3.0, 5.0);
		System.out.println(result1);
		System.out.println(result2);
	}

}
