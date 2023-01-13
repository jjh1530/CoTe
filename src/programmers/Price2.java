package programmers;

public class Price2 {

	public static void main(String[] args) {

		int[] budgets = {120,110,140,150};
		int M = 485;
		// 485 - 330  155
		int answer = 0;
		int min = 0;
		int max = 0;
		
		for(int i =0; i<budgets.length; i++) {
			if (budgets[i] > max) {
				max = budgets[i];  //최대값
			}
		}
		
		while(min <= max ) {
			int mid = (min+ max) /2;   // 75  113  132 122 127 129 128 127  //
			int sum = 0;
			for(int i =0; i<budgets.length; i++) {
				if (budgets[i] > mid) {  //각 값들이 미드보다 크면
					sum+= mid;    //미드값을  sum에
				}else {
					sum+= budgets[i]; // 값이 미드값보다 작으면 값을 넣어줌
				}
			}
			
			if (sum <= M) {  //sum이 전체 예싼을 넘지 않으면
				min = mid + 1; 
				answer = mid;
			}else {
				max = mid-1;
			}
			System.out.println(min);
		}
		System.out.println(answer);
		
		
	}

}
