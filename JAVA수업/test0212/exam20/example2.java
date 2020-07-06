package exam20;

import java.util.ArrayList;
import java.util.Collections;

public class example2 {
		// 리스트
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(30);
		nums.add(10);
		nums.add(40);
		nums.add(20);  //순서가 있다.-> 인덱스를 사용할 수 있다.
		
//		System.out.println(nums);
//		System.out.println(nums.get(0));
		
		Collections.sort(nums); //순서가 뒤죽박죽인 경우 순서를 차례대로 기존의 배열을 재배열 해줌.
		for(int i : nums) {
			System.out.println(i);
		}
		
		nums.clear();  // 안에 들어있는 내용을 비움.
		System.out.println(nums);
	}

}
