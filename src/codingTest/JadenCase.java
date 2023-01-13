package codingTest;

public class JadenCase {

	public static void main(String[] args) {

		String s = "3people unFollowed me";
		s = s.toLowerCase();
		String[] sarr = s.split(" ");
		String answer ="";
		for(int i =0; i<sarr.length; i++ ) {
			if (sarr[i].length() ==0)  {
				answer += " ";
			}else {
				String upperS = String.valueOf(sarr[i].charAt(0)).toUpperCase();
				answer +=upperS;
				answer += sarr[i].substring(1,sarr[i].length());
				
				answer += " ";	
			}
		}
		
		if (!s.substring(s.length()-1,s.length()).equals(" ")) {
			answer = answer.substring(0,answer.length() -1);
		}
		
		System.out.println(answer);
	}

}
