package codingTest;

public class GdcLcm {

	public static void main(String[] args) {

		int n = 3;
		int m = 12;
		int[] answer =new int[2];
		int x= 0;
		int max = 0;
		for(int i =1; i<=m; i++) {
			if (n%i ==0 && m %i == 0) {
				answer[x] = i;
				max= i;
			}
		}
		answer[0] = max;
		answer[1] = n*m/answer[0];
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

}
