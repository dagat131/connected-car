package day03;

public class Ex02 {

	public static void main(String[] args) {
		int Korean = 80;
		int English = 91;
		int Mat = 100;
		int All_score = Korean + English + Mat;
//		float avg = (float)(All_score / 3);
		float avg1 = (float)All_score / 3;
		float avg2 = Math.round(All_score / (float)3);
//		float avg4 = total / 3.0f;
		
		String AA = "=======================================\n";
		AA = AA + "����\t����\t����\t����\t���\n";
		AA = AA + "=======================================\n";
		AA = AA + (Korean + "\t" + English + "\t" + Mat + "\t" + All_score + "\t" + avg2 + "\n");
		AA = AA + "=======================================\n";
		
		String BB = "=======================================\n\n";
		String CC = "����\t����\t����\t����\t���\n\n";
		String DD = (Korean + "\t" + English + "\t" + Mat + "\t" + All_score + "\t" + avg2 + "\n\n");
		String EE = (BB + CC + BB + DD + BB);
		
		System.out.println(AA);
		System.out.println("\n");
		System.out.println(EE);
		
		
//		System.out.println("���� = "+ All_score);
////		System.out.println("��� = "+ avg);
//		System.out.println("��� = "+ avg1);
//		System.out.println("��� = "+ avg2);
////		System.out.println("��� = "+ avg3);
		
//		System.out.println("=======================================");
//		System.out.println("����\t����\t����\t����\t���");
//		System.out.println("=======================================");
//		System.out.println(Korean + "\t" + English + "\t" + Mat + "\t" + All_score + "\t" + avg2);
//		System.out.println("=======================================");
//		System.out.println();
		//System.out.println(printValue);
	}

}
