package lv_0;
import java.util.*;
//짝수 홀수 개수
//문제 설명
//정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중
//짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
//
//제한사항
//1 ≤ num_list의 길이 ≤ 100
//0 ≤ num_list의 원소 ≤ 1,000
//입출력 예
//num_list	       result
//[1, 2, 3, 4, 5]	   [2, 3]
//[1, 3, 5, 7]	   [0, 4]
//입출력 예 설명
//입출력 예 #1
//
//[1, 2, 3, 4, 5]에는 짝수가 2, 4로 두 개, 홀수가 1, 3, 5로 세 개 있습니다.

public class EvenOrOdd {
	//여기서 배울 점!!!
	//자바에서 배열을 추가하려면ex) int[] answer = new int[배열 수]; 이렇게 할당해 줘야 함

	public static void main(String[] args) {
		
		int[] num_list = {1, 3, 5, 7};
		
		int[] answer = new int[2];
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < num_list.length; i += 1) {
			if(num_list[i] % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
			
		  }
		answer[0] = even;
		answer[1] = odd;
		System.out.println(Arrays.toString(answer));
		
	}

}
