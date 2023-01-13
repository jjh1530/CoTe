package codingTest;

public class OverlapString {

	public static void main(String[] args) {
		String s = "ssssdddd";
		String answer ="";
		for(int i =0; i<s.length(); i++) {
			//indexOf 처음 나온 인덱스 값 return 없으면 -1
			if (s.indexOf(s.charAt(i))==i) {
				answer += s.charAt(i);
			}
		}
		System.out.println(answer);
	}

}
