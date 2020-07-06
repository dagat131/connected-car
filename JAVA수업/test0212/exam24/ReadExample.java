package exam24;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadExample {

	public static void main(String[] args) {
		try {
			ArrayList<String> arrayList = new ArrayList<String>();
			
			File myObj = new File("test.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				arrayList.add(data);
//				System.out.println(data);
			}
			myReader.close();
			
			for (int i = 0; i <arrayList.size(); i++) {
//				System.out.println(arrayList.get(i));
				String[] imsiArray = arrayList.get(i).split(",");
				System.out.print(imsiArray[0] + " ");  //이름
				System.out.print(imsiArray[1] + " ");  //국어
				System.out.print(imsiArray[2] + " ");  //영어
				System.out.print(imsiArray[3] + " ");  //수학
				
				int tot = 0;
				tot = tot + Integer.parseInt(imsiArray[1]);
				tot = tot + Integer.parseInt(imsiArray[2]);
				tot = tot + Integer.parseInt(imsiArray[3]);
				
				double avg = (double)tot / 3;
				
				System.out.print(tot + " ");
				System.out.println(avg);
				
			}
			
		}catch(Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
