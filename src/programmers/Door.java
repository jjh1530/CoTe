package programmers;

public class Door {

	public static void main(String[] args) {

		int goal = 43; // 목표 생산량
		int[] durations = {5,3,7,6,4}; //노동자의 하나 만드는 시간
		int[] doorNum = new int[durations.length];
		long sum =0;
		long min = Integer.MAX_VALUE;
		int maxDuration = 0; // 제일 오래 걸리는 시간
		long max = 0;
		
		for(int i =0; i<durations.length; i++) {
			maxDuration = Math.max(maxDuration,durations[i]); 
		}
		for(int i =0; i<durations.length; i++) {
			max =maxDuration * (goal/durations.length +1L);
			doorNum[i] = (goal-1)/durations[i];
		}
		System.out.println(max);
		for(int i =0; i<durations.length; i++) {
			if (min > doorNum[i] ) {
				min = doorNum[i];
			}
		}
		for(int i =0; i<doorNum.length; i++) {
			sum += (doorNum[i] - min) ;
		}
		long answer =0; 
		answer = sum * 10_000L;
		System.out.println(answer);
	}

}
