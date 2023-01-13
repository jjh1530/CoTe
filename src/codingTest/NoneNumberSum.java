package codingTest;

public class NoneNumberSum {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,6,7,8,0};
		int[] num = new int[10];
		int answer =0;
		for(int i =0; i<numbers.length; i++) {
			num[numbers[i]]++;
			
		}

		for(int i = 0; i <num.length; i++) {
			if (num[i]==0) {
				answer +=i;
			}
		}
		System.out.println(answer);
	}

}
