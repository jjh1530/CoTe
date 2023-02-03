package codingTest;

public class Wepon {

	public static void main(String[] args) {

		int number = 10;
		int limit = 3;
		int power = 2;
		
		int count = 0;
		int[] arr = new int[number];
		
		for(int i =1; i<=number; i++) {
			count = 0;
			for(int j =1; j*j<= i; j++) {
				if (j*j == i) {
					count ++;
				}else if(i % j == 0) {
					count+=2;
				}
			}
			arr[i-1] = count;
		}
		int answer = 0;
		for(int x : arr) {
			if (x >limit) {
				answer += power;
			}else {
				answer += x;
			}
		}
		System.out.println(answer);
		
	}
}
