package exam21;

import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
		//* 배열, List, Map <-- Container변수 : 반복문쓴다. 
		
		//Map
		HashMap<String,String> capitalCities = new HashMap<String,String>();
//		System.out.println(capitalCities);  // {}
		capitalCities.put("England", "London");  //값을 넣을때 풋을 사용
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");  // set, add, put  수정,저장할때 사용  해쉬맵에선 put 사용
//		System.out.println(capitalCities);
		
//		System.out.println(capitalCities.get("England"));  //get을 사용해서 잉글랜드의 수도를 불러옴.
		
		capitalCities.remove("England");
		System.out.println(capitalCities);

//		capitalCities.clear();
//		System.out.println(capitalCities);
		
		System.out.println(capitalCities.size());
		
		System.out.println();
		for (String s: capitalCities.keySet()) {  //키값을 출력
			System.out.println(s);
		}
		for (String s: capitalCities.values()) {  //밸류값을 출력
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
		
		//리스트는 대괄호를 사용함. 인덱스값을 불러올수 있음.
		// List.
		// - 순서가 있다.
		// - 중복된 값이 들어간다.
		//*Map  // key = value
		//{aaa=bbb, ccc=ddd}
		//해쉬맵은 중괄호를 사용함. 인덱스값을 불러올수 없음.
		//   키(잉글랜드) = 값(런던)
	}

}
