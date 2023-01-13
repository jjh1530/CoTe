package codingTest;


public class LottoMaxMin {

	public static void main(String[] args) {

		int[] lottos = {2,3,4,5,8,7};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] answer =new int[2];
		int[] maxrank = {6,5,4,3,2,1,0};
		int[] minrank = {6,5,4,3,2,1,0};
		int min = 0;
		int  zero = 0;
		for(int i =0; i<lottos.length; i++) {
			if (lottos[i] ==0 ) {
				zero++;
			} 
			for(int j =0; j<win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) { // 먼저 같은번호가 있으면 count ++
					min ++;
				}
			}
		}
		int max = zero+min;
		System.out.println(min+"최소");

		System.out.println(max+"최대");
		for(int i = 0; i<minrank.length; i++) {
			if (String.valueOf(minrank[i]).contains(String.valueOf(min))) {
				System.out.println( i + "등");
				answer[1] = i+1;
			}
			if (min == 0) {
				answer[1] = 6;
			}
			if (String.valueOf(maxrank[i]).contains(String.valueOf(max))) {
				System.out.println(i);
				answer[0] = i+1;
			}
			if (max == 0) {
				answer[0] = 6;
			}
			
		}
		
		for(int i =0; i<answer.length; i++) {
			System.out.println(answer[i]+"!!");
		}
		
		
	}

}
