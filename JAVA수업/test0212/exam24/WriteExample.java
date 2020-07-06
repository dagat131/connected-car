package exam24;

import java.io.FileWriter;

public class WriteExample {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("test.txt");
			myWriter.write("±Â");
			myWriter.close();
			System.out.println("¼º°ø");
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
