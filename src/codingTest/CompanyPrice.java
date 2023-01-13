package codingTest;

import java.util.Arrays;

public class CompanyPrice {

	public static void main(String[] args) {

		int[] d = {1,3,2,5,4};
		int budget = 9;
		Arrays.sort(d);
		int answer =0;
		int sum = 0;
		for(int i =0; i<d.length; i++) {
			System.out.println(d[i]);
			sum+= d[i];
			answer ++;
			if (sum ==budget) {
				break;
			}else if (sum >= budget) {
				answer --;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
