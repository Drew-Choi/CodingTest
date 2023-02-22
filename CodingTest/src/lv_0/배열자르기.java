package lv_0;

import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] numbers = {1,3,5};
		int num1 = 1;
		int num2 = 2;
		int a = 0;

	    int[] answer = new int[num2 - num1 + 1];
	    
	    for(int i = num1; i <= num2; i += 1) {
	    	answer[a] = numbers[i];
	    	a += 1;	    	
	    }
	    
	    System.out.println(Arrays.toString(answer));
	    
	    
	    

		int[] numbers2 = {1,7,8,10,19,20,22,30,31,32};
		int number1 = 2;
		int number2 = 5;

	    int[] answer2 = {};
	    
	    answer2 = Arrays.copyOfRange(numbers2, number1, number2 + 1);
	    
	    System.out.println(Arrays.toString(answer2));
	}

}

//java.util.*; 이용하면, Arrays.copyOfRange 이용할 수 있음
//Arrays.copyOfRange(복사하고자하는 배열, 시작 위치, 배열크기); or  Arrays.copyOfRange(복사하고자하는 배열, 배열크기);
//주의) 범위 설정 시, 3이라고 지정해주면 2까지 복사하니 주의