package exam20;

import java.util.ArrayList;

public class example {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Lexus");
		System.out.println(cars);
		
		System.out.println(cars.get(0));  //get�� ���� �ҷ���, �迭�� Ư������ �ҷ���
		System.out.println(cars.get(1));
		System.out.println(cars.get(2));
		System.out.println(cars.get(3));
//		System.out.println(cars.get(4));  // ��������. ���°�.
		
		cars.set(2, "Benz");  // set�� ���� ��������
		System.out.println(cars.get(2));
		System.out.println(cars);

		
		cars.remove(0);    // remove�� ���� ������.
		System.out.println(cars);
		
		/* arrayList , array ��̸���Ʈ�� �迭�� ������
		 * �迭�� ���� ������ ��� �� ������ �ε����� ���� ������ �����
		 * ������ ��̸���Ʈ�� ���� ������ ���� �ε����� ���� ������.
		 * 
		 */
		
		System.out.println(cars.size());  //�迭�� length�� ����ϴµ� ��̸���Ʈ�� size�� ��� .. ���� ���̸� �����Ҷ�
		
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println();
		
		for(String s : cars) {    //���� for��
			System.out.println(s);
		}
	
	}

}
