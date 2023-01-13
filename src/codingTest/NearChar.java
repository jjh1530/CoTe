package codingTest;

public class NearChar {

	public static void main(String[] args) {

		String s = "banana";
		int[] answer = new int[s.length()];
		answer[0] = -1;
		for(int i =1; i<s.length(); i++) { // b a n a n a
			int x= s.lastIndexOf(s.charAt(i),i-1); // 5번째라면 a를 5번째 a를 제외한 곧의 인덱스 번호를 찾음
			if (x!= -1) {
					answer[i] = i-x;  // i가 5이면  5 - 3(찾은 인덱스) 
			}else {
				answer[i] = x; // 못찾으면 -1
			}
		}
		
		for(int i =0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
	}

}
