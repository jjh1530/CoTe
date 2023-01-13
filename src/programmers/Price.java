package programmers;

import java.util.Arrays;

public class Price {
	public static void main(String[] args) {
		
		int[] d= {1,3,2,5,4};
		int budget = 9;
		int sum = 0;
		int count =0;
		Arrays.sort(d); // 1 2 3 4 5
		for(int i =0; i<d.length; i++) {
			sum+= d[i];
			count ++;
			if (sum == budget) {
				break;
			}else if (sum >= budget) {
				count --;
				break;
			}
		}
		int answer = count;
		System.out.println(count);
 	}

}
