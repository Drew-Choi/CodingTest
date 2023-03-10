package lv_0;

//문제 설명
//머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
//피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
//n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를
//return 하도록 solution 함수를 완성해보세요.

//제한사항
//2 ≤ slice ≤ 10
//1 ≤ n ≤ 100
//
//입출력 예
//slice	n	result
//7	    10	  2
//4    	12	  3


//입출력 예 설명
//입출력 예 #1
//10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.
//
//입출력 예 #2
//12명이 4조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 3판을 시켜야 합니다.

public class PizzaDivide3 {
	public static void main(String[] args) {
		int slice = 3;
	    int n = 77;
	    int i = 1;
	    int answer = 0;
	    
//	    while (i > 0) {
//	    	i += 1;
//	    	if (slice * i >= n) {
//	    		answer = i;
//	    		break;
//		
//	    	}
//	    }
//	    System.out.println(answer);
	    
	    
	    //다른 풀이, 조각단위로 인원수 나눠서 소수점이 나오면 1판이 더 필요한거라는 개념으로 접근
	    
	   if (n%slice == 0) {
		   answer = n/slice;
	   } else {
		   answer = n/slice + 1;
	   }
	   
	   System.out.println(answer);
	}
}	
    
    
   
   
