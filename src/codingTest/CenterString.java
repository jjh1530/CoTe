package codingTest;

public class CenterString {

	public static void main(String[] args) {

		String s ="abcdef";
		String answer ="";
		if (s.length()%2 == 0) {
			answer += s.charAt(s.length()/2-1);
			answer +=s.charAt(s.length()/2);
		}else {
			answer +=s.charAt(s.length()/2);
		}
		System.out.println(answer);
	}

}
