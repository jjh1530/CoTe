package inflearn;

public class PrimeNum {

	public static void main(String[] args) {
		int n = 20;
		int[] arr = new int[n+1];
		int  count = 0;
		
		for(int i =2; i<=n; i++) {
			if (arr[i] ==0) {
				count++;
				System.out.println(i);
				for(int j = i; j<=n; j+=i) {
					arr[j] = 1;
				}
			}
		}
	
		
	}

}
