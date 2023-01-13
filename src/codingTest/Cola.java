package codingTest;

public class Cola {

	public static void main(String[] args) {
		int a = 3; // a를 주면
		int b = 2; // b만큼 줌
		int n = 720; //처음개수
		
		int answer =0;
		while(true) {
			if(n < a) {
				break;
			}
			answer += (n/a) *b;
			System.out.println(answer);
			int remain = n%a;
			n= (n/a)*b + remain;
		}
		System.out.println(answer);
	}
}
