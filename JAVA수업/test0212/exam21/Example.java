package exam21;

import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
		//* �迭, List, Map <-- Container���� : �ݺ�������. 
		
		//Map
		HashMap<String,String> capitalCities = new HashMap<String,String>();
//		System.out.println(capitalCities);  // {}
		capitalCities.put("England", "London");  //���� ������ ǲ�� ���
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");  // set, add, put  ����,�����Ҷ� ���  �ؽ��ʿ��� put ���
//		System.out.println(capitalCities);
		
//		System.out.println(capitalCities.get("England"));  //get�� ����ؼ� �ױ۷����� ������ �ҷ���.
		
		capitalCities.remove("England");
		System.out.println(capitalCities);

//		capitalCities.clear();
//		System.out.println(capitalCities);
		
		System.out.println(capitalCities.size());
		
		System.out.println();
		for (String s: capitalCities.keySet()) {  //Ű���� ���
			System.out.println(s);
		}
		for (String s: capitalCities.values()) {  //������� ���
			System.out.println(s);
		}
		for (String s: capitalCities.keySet()) {
			System.out.println("Key : " + s + ", vlaue : " + capitalCities.get(s));
		}
		System.out.println();
		
		HashMap<String, String> people = new HashMap<String, String>();
		
		people.put("john", "32");
		people.put("Steve", "30");
		people.put("Angle", "33");
		System.out.println(people);
		for(String i : people.keySet()) {
			System.out.println(i + " " + Integer.parseInt(people.get(i)));
		}
		
		//����Ʈ�� ���ȣ�� �����. �ε������� �ҷ��ü� ����.
		// List.
		// - ������ �ִ�.
		// - �ߺ��� ���� ����.
		//*Map  // key = value
		//{aaa=bbb, ccc=ddd}
		//�ؽ����� �߰�ȣ�� �����. �ε������� �ҷ��ü� ����.
		//   Ű(�ױ۷���) = ��(����)
	}

}
