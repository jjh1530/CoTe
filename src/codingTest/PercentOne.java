package codingTest;

public class PercentOne {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		
		for( int i=1; i<=n; i++) {
			if (n%i==1) {
				answer = i;
				break;
			}
		}

	}

}
