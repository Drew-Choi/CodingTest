package lv_0;

//특정 문자 제거하기
//문제 설명
//문자열 my_string과 문자 letter이 매개변수로 주어집니다.
//my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ my_string의 길이 ≤ 100
//letter은 길이가 1인 영문자입니다.
//my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
//대문자와 소문자를 구분합니다.
//입출력 예
//my_string	letter	  result
//"abcdef"	"f"	     "abcde"
//"BCBdbe"	"B"      "Cdbe"
//
//입출력 예 설명
//입출력 예 #1
//
//"abcdef" 에서 "f"를 제거한 "abcde"를 return합니다.

public class LetterDeletCharAt {

	public static void main(String[] args) {
       
		String my_string = "abcdef";
		String letter = "f";
		
	    String answer = "";
//	    
	    for (int i = 0; i < my_string.length(); i += 1) {
	    	char changeChar = letter.charAt(0);
	    	char changeChar2 = my_string.charAt(i);
	    	if (changeChar2 != changeChar) {
	    		answer += changeChar2;
	    	}
	    }
	    
	    System.out.println(answer);
	    
	    
	    //더 쉬운 풀이
	   String answer2 = "";
	   answer2 += my_string.replaceAll(letter, "");
	   System.out.println(answer2);
		
	}

}
