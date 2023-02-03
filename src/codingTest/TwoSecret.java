package codingTest;

public class TwoSecret {

	public static void main(String[] args) {

		String s ="aukks";
		String skip = "wbqd";
		int index = 20;
		String answer = "";
		for(char x : s.toCharArray()) { // a u k k s
			char si = (char)(x+index);  // f z p p x
			int count = 0;
			for(int i =0; i<index; i++) {
				char ts = (char)(x+i+1);	//a  기준 b c d e f  b부터 +5까지의 알파벳들
				for(int j =0; j<skip.length(); j++) {
					if (ts == skip.charAt(j)) { //  b c d e f가  w b q d 에 있으면 count ++
						count++;
					}
				}
			}
			System.out.println(count);
			System.out.println((char)(si+count));
			int test = si+count;
			if (test <=  122) {
				answer += (char)(si+count);
			}else {
				while(test >=123) {
					System.out.println(test+"@@@@@@@@");
					test -= 26;
					answer += (char)(si+count-26); 
				}
			}
		}
		System.out.println(answer);
	}

}
