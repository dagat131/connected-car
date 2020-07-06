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
		
		System.out.println(cars.get(0));  //get은 값을 불러옴, 배열의 특정값을 불러옴
		System.out.println(cars.get(1));
		System.out.println(cars.get(2));
		System.out.println(cars.get(3));
//		System.out.println(cars.get(4));  // 오류가뜸. 없는값.
		
		cars.set(2, "Benz");  // set은 값을 수정해줌
		System.out.println(cars.get(2));
		System.out.println(cars);

		
		cars.remove(0);    // remove는 값을 삭제함.
		System.out.println(cars);
		
		/* arrayList , array 어레이리스트와 배열의 차이점
		 * 배열은 값을 삭제할 경우 그 삭제한 인덱스의 값의 공간은 비어짐
		 * 하지만 어레이리스트의 경우는 삭제한 뒤의 인덱스의 값이 땡겨짐.
		 * 
		 */
		
		System.out.println(cars.size());  //배열은 length를 사용하는데 어레이리스트는 size를 사용 .. 값의 길이를 측정할때
		
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println();
		
		for(String s : cars) {    //향상된 for문
			System.out.println(s);
		}
	
	}

}
