package codingTest;

public class DivisorSum {

	public static void main(String[] args) {

		int left = 13;
		int right = 17;
		int count = 0;
		int answer =0;
		for(int i = left; i <= right; i++) {
			
			count = 0;
			for(int j = 1; j<=i; j++) {
				if (i%j ==0) {
					count ++;
				}
			}
			if(count%2 ==0) {
				answer += i;
			}else {
				answer -=i;
			}
		}
		System.out.println(answer);
	}

}
