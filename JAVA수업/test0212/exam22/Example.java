package exam22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		
//		System.out.println(set1);  //[]
		boolean flag1 = set1.add("kim");
		boolean flag2 = set1.add("Lee");
		boolean flag3 = set1.add("jang");
		boolean flag4 = set1.add("jung");
		boolean flag5 = set1.add("park");
		System.out.println(set1);    // set은 중복이 없고, 순서도 없다.
		
		System.out.println();
		
		Iterator<String> iter = set1.iterator();  // iterator = 반복자
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
			System.out.println();
		}
		
		set1.remove("Lee");
		for (String s : set1) {
			System.out.println(s);
		}
		
//		Iterator<String> iterator = map.keySet().iterator();
//		while (iterator.hasNext()) {
//			String key = iterator.next();
//			String value = map.get(key);
//			System.out.println(key + " / " + value);
//		}
	}

}
