package codingTest;

public class Collatz {

	public static void main(String[] args) {
		int num = 6;
		long ln = num;
		int answer = 0;
		while(ln!=1) {
			if (ln%2 ==0) {
				ln = ln/2;
				answer ++;
			}else {
				ln = ln*3+1;
				answer ++;
			}
			if (answer == 500) {
				answer = -1;
				break;
			}
		}
		System.out.println(answer);
		
		
	}
}
