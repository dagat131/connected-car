package exam21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<String,String>();
		ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
		
		
		while(true) {
		System.out.println("name : ");
		String name = null;
		name = input.next();
		
		if(name.contentEquals("q")) {
			break;
		}

		System.out.println("kor : ");
		String kor = null;
		kor = input.next();

		System.out.println("mat : ");
		String mat = null;
		mat = input.next();

		System.out.println("eng : ");
		String eng = null;
		eng = input.next();

		System.out.println("sci : ");
		String sci = null;
		sci = input.next();
		
		int tot = Integer.parseInt(kor) + Integer.parseInt(mat) + Integer.parseInt(eng) + 
				Integer.parseInt(sci);
		double avg = (double)tot / 3;
		
		String all = "" + tot;
		String avgg = "" + avg;
		
		map = new HashMap<String, String>();
		map.put("name", name);
		map.put("kor", kor);
		map.put("eng", eng);
		map.put("mat", mat);
		map.put("sci", sci);
		map.put("tot", all);
		map.put("avg", avgg);
		
		
		arrayList.add(map);
		
		}for (int i = 0; i<arrayList.size(); i++) {
			for (String s : arrayList.get(i).keySet()) {
				System.out.print(s + ", " + arrayList.get(i).get(s) + " / ");
			}
			System.out.println();
			
			for( Entry<String, String> h : arrayList.get(i).entrySet() ) {
				System.out.println(h.getKey() + ":" + h.getValue() + " / ");
			}
		}
		
	}

}
