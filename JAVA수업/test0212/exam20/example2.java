package exam20;

import java.util.ArrayList;
import java.util.Collections;

public class example2 {
		// ����Ʈ
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(30);
		nums.add(10);
		nums.add(40);
		nums.add(20);  //������ �ִ�.-> �ε����� ����� �� �ִ�.
		
//		System.out.println(nums);
//		System.out.println(nums.get(0));
		
		Collections.sort(nums); //������ ���׹����� ��� ������ ���ʴ�� ������ �迭�� ��迭 ����.
		for(int i : nums) {
			System.out.println(i);
		}
		
		nums.clear();  // �ȿ� ����ִ� ������ ���.
		System.out.println(nums);
	}

}
