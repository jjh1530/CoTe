package programmers;

import java.util.Arrays;

public class Price {
	public static void main(String[] args) {
		
		/*
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
		System.out.println(count);*/
		int[] budgets= {1,3,2,5,4};
		int M = 9;
		
		/*
		int min =0;
		int max = 0;
		
		for(int b : d) {
			if (b>max) {   // d의 맥스값 5
				max = b; 
			}
		}
		while(min <= max) {  // 0이 5와 같거나 커질때까지
			int mid = (min +max) / 2;  // mid 는2부터
			int sum = 0;
			for(int b :d) {  
				if (b > mid) {  // 1 3 2 5 4 b가  mid값보다 크면
					sum+=mid;
				}else {
					sum+= b;
				}
				if (sum <= budget) {
					min = mid + 1;
					answer = mid;
				}else {
					max = mid -1;
				}
			}
		}*/
 	}

}
