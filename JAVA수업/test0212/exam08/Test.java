package exam08;


class Test {
//	String kind = "bird";
//	static String kind = "bird";
	
//	static void method1() { //static�� �ְ� �Ǹ� ��ü���� �����ʰ� �ҷ��ü��ִ�.
//		System.out.println("-- method1 --");
//	}
	
	String sum(int i, int j) {
		int a = i + j;
		int b = i - j;
		int c = i * j;
//		return a, b, c;    //���ϰ��� 2���� �ִ�
		String d = "" + a + "," + b +"," + c;
		return d;
	}
	
	public static void main(String[] args) {
//		Test test = new Test();   // �ȿ� ��ġ�ϴ��� ��ü�����ؼ� �ҷ��;���.
//		test.method1();
//		Test t = new Test();
//		t.method1();
//		method1();  //static�� �ְ� �Ǹ� ��ü���� �����ʰ� �ҷ��ü��ִ�.
		
//		Test t = new Test();
//		System.out.println((t.kind)); // ����ҷ��� ����Ʈ. ��ü���� �� ����Ʈ ���� �־������.
//		System.out.println(kind);  // ����ƽ�� ���� ��ü���������ʰ� �ٷ� ��°���.   static -> �����Ѵ�. ������ü���� ��������.
		
		/* ���������� : 
		 * public > (default)(�ƹ��͵� �Ⱥ��̸� ����Ʈ�� �ǹ�) > private
		 * public : ������ ����.   ->> ���帹�� ���
		 * default : ���� ��Ű�������� �����ϴ�.
		 * private : �ڱ� Ŭ���� �������� ����� �� �ִ�.
		 * 
		 *
		 * static : ��ü�������� ��밡��, ���� ������ ��.
		 *          ��������� ����޼ҵ�� �Ⱥٿ��� ���� ������ ��ü�����ؼ� ���..
		 * 
		 * �޼ҵ� : �ݺ����� ��, ���� ���ɼ��� �ִ� ���� ����� ���� �ʿ� �� �� ���� �ҷ����� ����� ���.
		 *        ȣ���Ѵٰ� ǥ��..
		 *        static �ٿ��� �� �Ⱥٿ����� ������. -> ���̴� ��쿣 ��ü�������� �ʰ� �ҷ����� ����
		 *                                     ������ ���� ��쿣 ��ü���� ������ �ʿ���.
		 * 
		 * �����ε�(Overloading) : �Ű������� �ߺ��Ǹ� �ȵȴ�., �����ڿ����ε�, �޼ҵ�����ε� // �̸��� �Ȱ��� �Ű����� ������ �迭�� �ٸ� ���� �����ε��̶� �Ѵ�.
		 * �������̵�(Overriding)
		 * 
		 * ĸ��ȭ : Getter & Setter   --> ��������� private ����ϴµ� ��� Ȱ���ϳĿ��� ĸ��ȭ�� ����
		 *
		 * 2�����迭
		 * 
		 * ��� : private, final
		 *  -> ������
		 *
		 */
		Test t = new Test();
		String result = t.sum(3, 5);   //�ִ� ���� �������̱� ������ ������� ������ �����־�� �Ѵ�.
		System.out.println(result);
		
		
		
		
		
	}

}
