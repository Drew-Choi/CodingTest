package lv_0;

public class StringRevers {

	public static void main(String[] args) {

		String my_string = "jaron";
		
		String answer = "";
		
		for (int i = my_string.length(); i > 0; i -= 1) {
			answer += my_string.charAt(i - 1);
		}
		
		System.out.println(answer);
		
		
	}

}
