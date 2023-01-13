package codingTest;

public class Lv2_5 {

	public static void main(String[] args) {

		String s = "110010101001";
		int[] answer = new int[2];
		while(s.length()> 1) {  // s의 길이가 1이상 // 다시 110  // 10
			int count = 0;
			for(int i=0; i<s.length();i++) {
				
				if (s.charAt(i)== '0') {  // s의 인덱스 값이 0일경우 
					answer[1]++; // 0의 값 추가  6 + 1 + 1
				}else {
					count ++; // 1이면 count ++ (6)  2
				}
			}
			s = Integer.toBinaryString(count); // 6을 2진수로  0110 // 10
			answer[0] ++; // 변환 횟수 ++  
 		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	
	}

}
