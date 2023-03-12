package lv_0;

//자릿수 더하기
//문제 설명
//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
//
//제한사항
//0 ≤ n ≤ 1,000,000
//입출력 예
//n	     result
//1234       10
//930211	   16
//입출력 예 설명
//입출력 예 #1
//
//1 + 2 + 3 + 4 = 10을 return합니다.
//입출력 예 #2
//
//9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.
import java.util.*;
public class 자릿수더하기 {

	public static void main(String[] args) {
		
		int  n = 1234;
		int answer = 0;
		
		String toS = Integer.toString(n);
		int[] arr = new int[toS.length()];
		
		for(int i = 0; i < toS.length(); i += 1) {
		arr[i] = toS.charAt(i) - '0';
		//뒤에 -'0'을 붙여주는 이유는 문자형을 int로 변환하면(arr이 int배열이므로) 아스키 코드로 반환한다.
		//그래서 숫자를 맞춰줘야하는데, 0은 48이고 이걸 기준으로 1 = 49, 2 = 50 .... 이 되므로 -48 즉, 0의 아스키코드를 빼주면
		//내가 원하는 숫자를 넣을 수 있다.
		
	    answer += arr[i];
	
		}

		System.out.print(answer);

	}

}
